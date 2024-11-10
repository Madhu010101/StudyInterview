oc project idna-cis-fusebusinessobject-prod

oc create secret generic svc-cus-interactions-prod-keytab --from-file=./SVC_CST_CusCach_prod.keytab

oc create configmap krb5-config --from-file=./krb5.conf

oc create configmap graylog-configmap --from-file=./org.ops4j.pax.logging.cfg

oc delete configmap kafka-jaas-cust-interaction-events

oc create configmap kafka-jaas-cust-interaction-events --from-file=./kafka.jaas

oc delete configmap cust-interaction-events-schema-configmap

oc create configmap cust-interaction-events-schema-configmap --from-file=./CustInteractionEventBusinessObject.avsc

oc delete configmap cst-cust-interaction-events-transformer-configmap

oc create configmap cst-cust-interaction-events-transformer-configmap --from-file=./properties.cfg

rm -rf ../../../src/main/fabric8/deployment.yml

cp deployment.yml ../../../src/main/fabric8/
