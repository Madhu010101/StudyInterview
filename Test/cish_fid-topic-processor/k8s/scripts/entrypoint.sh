#!/bin/bash

/opt/promtail/run.sh

ENV=$environment

if [[ $ENV == "dev" ]] || [[ $ENV == "int" ]];then
java -Djava.security.egd=file:/dev/./urandom -jar /opt/app/fid-topic-processor.jar
fi

if [[ $ENV == "qa" ]] || [[ $ENV == "stress" ]] || [[ $ENV == "prod" ]];then
java -javaagent:/opt/appdynamics/javaagent.jar -Dappdynamics.socket.collection.bci.enable=false -jar  /opt/app/fid-topic-processor.jar
fi
