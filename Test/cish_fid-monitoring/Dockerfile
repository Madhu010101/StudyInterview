FROM cit-rqukbharbor.fnb.co.za/baseos/grafana-loki:jdk17
MAINTAINER dlfnbcishavengers@fnb.co.za
VOLUME /tmp
EXPOSE 9543

WORKDIR /opt/app

RUN mkdir -p /opt/app/dlqmntr/incoming
RUN mkdir -p /opt/app/dlqmntr/done

ARG JAR_FILE=target/fid-monitoring-*.jar
COPY ${JAR_FILE} fid-monitoring.jar

COPY k8s/scripts/run.sh /opt/app/rsyslog/run.sh
RUN chmod a+x /opt/app/rsyslog/run.sh
COPY k8s/scripts/entrypoint.sh /opt/app/entrypoint.sh
RUN chmod +x /opt/app/entrypoint.sh

ENTRYPOINT ["sh","/opt/app/entrypoint.sh"]
