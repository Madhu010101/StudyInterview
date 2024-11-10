oc project idna-cis-fusebusinessobject-prod

oc delete secret svc-cus-cache-prod-keytab

oc create secret generic svc-cus-cache-prod-keytab --from-file=./SVC_CST_CusCach_prod.keytab

oc create secret generic eeh-prod-keystore --from-file=./keystore.jks

oc create secret generic eeh-prod-truststore --from-file=./truststore.jks

oc delete configmap krb5-config

oc create configmap krb5-config --from-file=./krb5.conf

oc delete configmap kafka-jaas-product-holding

oc create configmap logback --from-file=./logback.xml

oc create configmap product-holding-transform-template --from-file=./transform.ftl

oc create configmap kafka-jaas-product-holding --from-file=./kafka.jaas

oc delete configmap product-holding-transformer-configmap

oc create configmap product-holding-transformer-configmap --from-file=./properties.cfg

oc delete configmap product-holding-schema

oc create configmap product-holding-schema --from-file=./BusinessObject.avsc

rm -rf ../../../src/main/fabric8/deployment.yml

mkdir -p ../../../src/main/fabric8/

cp deployment.yml ../../../src/main/fabric8/

rm -rf ../../../src/main/resources/logback.xml

cp logback.xml ../../../src/main/resources/
