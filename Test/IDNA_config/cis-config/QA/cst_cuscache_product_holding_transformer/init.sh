oc project idna-cis-fusebusinessobject-qa

oc create secret generic svc-cus-ph-qa-keytab --from-file=./SVC_CST_CusCache_uat.keytab

oc create configmap krb5-config --from-file=./krb5.conf

oc create configmap graylog-configmap --from-file=./org.ops4j.pax.logging.cfg

oc delete configmap kafka-jaas-product-holding

oc create configmap kafka-jaas-product-holding --from-file=./kafka.jaas

oc delete configmap cst-product-holding-schema-configmap

oc create configmap cst-product-holding-schema-configmap --from-file=./ProductHoldingBusinessObject.avsc

oc delete configmap cst-product-holding-transformer-configmap

oc create configmap cst-product-holding-transformer-configmap --from-file=./properties.cfg

rm -rf ../../src/main/fabric8/deployment.yml

cp ./deployment.yml ../../src/main/fabric8/

cd ../..

mvn clean install

mvn fabric8:build

mvn fabric8:resource

mvn fabric8:resource-apply