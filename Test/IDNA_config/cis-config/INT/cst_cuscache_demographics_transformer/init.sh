oc project idna-cis-fusebusinessobject-int

oc create secret generic svc-cuscache-int-keytab --from-file=./SVC_CST_CusCache_uat.keytab

oc create secret generic keystore-secret --from-file=./keystore.jks

oc create secret generic truststore-secret --from-file=./truststore.jks

oc create configmap krb5-config --from-file=./krb5.conf

oc create configmap graylog-configmap --from-file=./org.ops4j.pax.logging.cfg

oc delete configmap kafka-jaas-demographics

oc create configmap kafka-jaas-demographics --from-file=./kafka.jaas

oc delete configmap cst-demographics-schema-configmap

oc create configmap cst-demographics-schema-configmap --from-file=./DemographicsBusinessObject.avsc

oc delete configmap cst-demographics-freemarker-configmap

oc create configmap cst-demographics-freemarker-configmap --from-file=./transform.ftl

oc delete configmap cst-demographics-transformer-configmap

oc create configmap cst-demographics-transformer-configmap --from-file=./properties.cfg

rm -rf ../../src/main/fabric8/deployment.yml

cp ./deployment.yml ../../src/main/fabric8/

cd ../..

mvn clean install

mvn fabric8:build

mvn fabric8:resource

mvn fabric8:resource-apply