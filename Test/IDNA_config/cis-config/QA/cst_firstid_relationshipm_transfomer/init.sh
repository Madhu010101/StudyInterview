oc project idna-cis-fusebusinessobject-qa

oc create secret generic svc-relationshipmasterentity-qa-keytab --from-file=./SVC_PM_OPM1_uat.keytab

oc create configmap krb5-config --from-file=./krb5.conf

oc create configmap graylog-configmap --from-file=./org.ops4j.pax.logging.cfg

oc delete configmap kafka-jaas-relationshipmasterentity

oc create configmap kafka-jaas-relationshipmasterentity --from-file=./kafka.jaas

oc delete configmap cst-relationshipmasterentity-schema-configmap

oc create configmap cst-relationshipmasterentity-schema-configmap --from-file=./RelationshipMasterModel.avsc

oc delete configmap cst-relationshipmasterentity-freemarker-configmap

oc create configmap cst-relationshipmasterentity-freemarker-configmap --from-file=./transform.ftl

oc delete configmap cst-relationshipmasterentity-transformer-configmap

oc create configmap cst-relationshipmasterentity-transformer-configmap --from-file=./properties.cfg

rm -rf ../../src/main/fabric8/deployment.yml

cp ./deployment.yml ../../src/main/fabric8/

cd ../..

mvn clean install

mvn fabric8:build

mvn fabric8:resource

mvn fabric8:resource-apply