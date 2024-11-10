#!/bin/bash
/opt/promtail/run.sh

{% if server_env == "dev" or server_env == "int" or server_env == "qa" %}
java -Xmx256m -jar /opt/app/{{ artifact_name }}-{{ artifact_ver }}.jar  --spring.config.location=/opt/app/application.yml
{% endif %}

{% if server_env == "stress" or server_env == "prod" %}
java -javaagent:/opt/appdynamics/javaagent.jar -Dappdynamics.agent.nodeName=`hostname` -Dappdynamics.agent.uniqueHostId=`hostname` -Dappdynamics.socket.collection.bci.enable=false -Xmx256m -jar  /opt/app/{{ artifact_name }}-{{ artifact_ver }}.jar  --spring.config.location=/opt/app/application.yml
{% endif %}

