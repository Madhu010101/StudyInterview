#!/bin/bash

/opt/promtail/run.sh
ENV=$environment
if [[ $ENV == "dev" ]] || [[ $ENV == "int" ]];then
java -jar /opt/app/customer-cache-dlq-monitoring.jar
fi

if [[ $ENV == "qa" ]] || [[ $ENV == "stress" ]] || [[ $ENV == "prod" ]];then
java -javaagent:/opt/appdynamics/javaagent.jar -Dappdynamics.socket.collection.bci.enable=false -jar  /opt/app/fid-monitoring.jar
fi
