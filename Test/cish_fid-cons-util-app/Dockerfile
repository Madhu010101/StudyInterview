FROM cit-rbsuharbor.fnb.co.za/baseos/grafana-loki:jdk17
MAINTAINER DLFNBCISHAVENGERS@fnb.co.za
VOLUME /tmp

WORKDIR /opt/app

ARG JAR_FILE=target/fid-cons-util-app*.jar
COPY ${JAR_FILE} /opt/app/fid-cons-util-app.jar

COPY k8s/scripts/entrypoint.sh /opt/app/entrypoint.sh
RUN chmod +x /opt/app/entrypoint.sh

ENTRYPOINT ["sh","/opt/app/entrypoint.sh"]
