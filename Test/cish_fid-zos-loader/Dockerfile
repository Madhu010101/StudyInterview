FROM cit-rbsuharbor.fnb.co.za/baseos/grafana-loki:jdk17
MAINTAINER DLFNBCISHAVENGERS@fnb.co.za
VOLUME /tmp

WORKDIR /opt/app

ARG JAR_FILE=target/fid-zos-loader*.jar
COPY ${JAR_FILE} /opt/app/fid-zos-loader.jar

COPY k8s/scripts/run.sh /opt/app/rsyslog/run.sh
RUN chmod a+x /opt/app/rsyslog/run.sh
COPY src/main/resources/config/trustStore.jks /opt/app/

COPY k8s/scripts/entrypoint.sh /opt/app/entrypoint.sh
RUN chmod +x /opt/app/entrypoint.sh

RUN chown -R citadmin. /opt/app
 
USER citadmin

ENTRYPOINT ["sh","/opt/app/entrypoint.sh"]
