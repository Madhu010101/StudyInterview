
oc project idna-cis-fusebusinessobject-prod

oc delete secret opm-firstidmasterentity-prod-keytab

oc create secret generic opm-firstidmasterentity-prod-keytab --from-file=./SVC_PM_OPM1_prod.keytab

oc delete secret opm-firstidmasterentity-prod-keystore

oc create secret generic opm-firstidmasterentity-prod-keystore --from-file=./keystore.jks

oc delete secret opm-firstidmasterentity-prod-truststore

oc create secret generic opm-firstidmasterentity-prod-truststore --from-file=./truststore.jks

oc create configmap krb5-config --from-file=./krb5.conf

oc create configmap logback --from-file=./logback.xml

oc delete configmap opm-firstidmasterentity-transform-template

oc create configmap opm-firstidmasterentity-transform-template --from-file=./transform.ftl

oc delete configmap opm-firstidmasterentity-kafka-jaas

oc create configmap opm-firstidmasterentity-kafka-jaas --from-file=./kafka.jaas

oc delete configmap opm-firstidmasterentity-transformer-configmap

oc create configmap opm-firstidmasterentity-transformer-configmap --from-file=./properties.cfg

oc delete configmap opm-firstidmasterentity-schema

oc create configmap opm-firstidmasterentity-schema --from-file=./FirstIdMasterEntityBusinessObject.avsc

rm -rf ../../../src/main/fabric8/deployment.yml

mkdir -p ../../../src/main/fabric8/

cp deployment.yml ../../../src/main/fabric8/

rm -rf ../../../src/main/resources/logback.xml

cp logback.xml ../../../src/main/resources/
