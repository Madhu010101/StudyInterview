#!/bin/bash

/opt/promtail/run.sh

ENV=$environment

if [[ $ENV == "dev" ]] || [[ $ENV == "int" ]];then
java -Djava.security.egd=file:/dev/./urandom -Djavax.net.ssl.trustStore=/opt/app/trustStore.jks -Djavax.net.ssl.trustStorePassword=$keystore_pass -Djavax.net.ssl.keyStore=/opt/app/trustStore.jks -Djavax.net.ssl.keyStorePassword=$keystore_pass -jar /opt/app/fid-zos-loader.jar
fi

if [[ $ENV == "qa" ]] || [[ $ENV == "stress" ]] || [[ $ENV == "prod" ]];then
java -javaagent:/opt/appdynamics/javaagent.jar -Dappdynamics.socket.collection.bci.enable=false -Djavax.net.ssl.trustStore=/opt/app/trustStore.jks -Djavax.net.ssl.trustStorePassword=$keystore_pass -Djavax.net.ssl.keyStore=/opt/app/trustStore.jks -Djavax.net.ssl.keyStorePassword=$keystore_pass -jar  /opt/app/fid-zos-loader.jar
fi
