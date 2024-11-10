oc project idna-cis-fusebusinessobject-prod

oc delete secret svc-irelationship-prod-keytab

oc create secret generic svc-irelationship-prod-keytab --from-file=./SVC_KFKA_CUS_PROD.keytab

oc create secret generic eeh-prod-keystore --from-file=./keystore.jks

oc create secret generic eeh-prod-truststore --from-file=./truststore.jks

oc delete configmap krb5-config

oc create configmap krb5-config --from-file=./krb5.conf

oc delete configmap kafka-jaas-irelationship

oc create configmap logback --from-file=./logback.xml

oc delete configmap transform-template-irelationship

oc create configmap transform-template-irelationship --from-file=./transform.ftl

oc create configmap kafka-jaas-irelationship --from-file=./kafka.jaas

oc delete configmap irelationship-transformer-configmap

oc create configmap irelationship-transformer-configmap --from-file=./properties.cfg

oc delete configmap irelationship-schema

oc create configmap irelationship-schema --from-file=./BusinessObject.avsc

rm -rf ../../../src/main/fabric8/deployment.yml

mkdir -p ../../../src/main/fabric8/

cp deployment.yml ../../../src/main/fabric8/

rm -rf ../../../src/main/resources/logback.xml

cp logback.xml ../../../src/main/resources/
