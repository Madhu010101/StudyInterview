oc project idna-cis-fusebusinessobject-qa

oc create secret generic kafka-truststore --from-file=./SSL/kafka-truststore.jks

oc create secret generic kafka-keystore --from-file=./SSL/kafka-keystore.jks

oc apply -f ./Configs

