FROM cit-rbsuharbor.fnb.co.za/baseos/grafana-loki:jdk17
MAINTAINER DLFNBCSTTransformers@fnb.co.za 
VOLUME /tmp
EXPOSE 9543

WORKDIR /opt/app

COPY src/main/resources/certs/trustStore.jks trustStore.jks

ARG JAR_FILE=target/fid-kafka-reader*.jar
COPY ${JAR_FILE} fid-kafka-reader.jar

COPY k8s/scripts/run.sh /opt/app/rsyslog/run.sh
COPY k8s/scripts/keytab.sh /opt/app/keytab.sh
RUN chmod a+x /opt/app/rsyslog/run.sh
COPY k8s/scripts/entrypoint.sh /opt/app/entrypoint.sh
RUN chmod +x /opt/app/entrypoint.sh
RUN chmod +x /opt/app/keytab.sh
RUN chown -R citadmin. /opt/app
USER citadmin

ENTRYPOINT ["sh","/opt/app/entrypoint.sh"]
