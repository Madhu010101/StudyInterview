oc project idna-cis-fusebusinessobject-prod

oc create secret generic svc-firstidmasterentity-prod-keytab --from-file=./SVC_PM_OPM1_prod.keytab

oc create configmap krb5-config --from-file=./krb5.conf

oc create configmap graylog-configmap --from-file=./org.ops4j.pax.logging.cfg

oc delete configmap kafka-jaas-relationshipmasterentity

oc create configmap kafka-jaas-relationshipmasterentity --from-file=./kafka.jaas

oc delete configmap cst-relationshipmasterentity-schema-configmap

oc create configmap cst-relationshipentity-schema-configmap --from-file=./RelationshipMasterModel.avsc

oc delete configmap cst-relationshipmasterentity-freemarker-configmap

oc create configmap cst-relationshipmasterentity-freemarker-configmap --from-file=./transform.ftl


oc delete configmap cst-relationshipmasterentity-transformer-configmap

oc create configmap cst-relationshipmasterentity-transformer-configmap --from-file=./properties.cfg

rm -rf ../../../src/main/fabric8/deployment.yml

cp deployment.yml ../../../src/main/fabric8/
