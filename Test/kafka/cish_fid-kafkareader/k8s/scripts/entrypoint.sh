#!/bin/bash

/opt/promtail/run.sh

ENV=$environment

/opt/app/keytab.sh
sleep 8

if [[ $ENV == "dev" ]] || [[ $ENV == "int" ]];then
java -jar  /opt/app/fid-kafka-reader.jar 
fi

if [[ $ENV == "qa" ]] || [[ $ENV == "stress" ]] || [[ $ENV == "prod" ]];then
java -javaagent:/opt/appdynamics/javaagent.jar -Dappdynamics.socket.collection.bci.enable=false -jar   /opt/app/fid-kafka-reader.jar
fi
