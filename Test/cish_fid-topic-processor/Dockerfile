FROM cit-rbsuharbor.fnb.co.za/baseos/grafana-loki:jdk17
MAINTAINER DLFNBCISHAVENGERS@fnb.co.za
VOLUME /tmp
EXPOSE 9543

WORKDIR /opt/app

ARG JAR_FILE=target/fid-topic-processor*.jar
COPY ${JAR_FILE} fid-topic-processor.jar

COPY k8s/scripts/run.sh /opt/app/rsyslog/run.sh
COPY k8s/scripts/keytab.sh /opt/app/keytab.sh
RUN chmod a+x /opt/app/rsyslog/run.sh
COPY k8s/scripts/entrypoint.sh /opt/app/entrypoint.sh
RUN chmod +x /opt/app/entrypoint.sh
RUN chmod +x /opt/app/keytab.sh

ENTRYPOINT ["sh","/opt/app/entrypoint.sh"]
