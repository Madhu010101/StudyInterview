oc login https://idna-kubernetes.fnb.co.za:443 --token=eyJhbGciOiJSUzI1NiIsImtpZCI6IiJ9.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJkZWZhdWx0Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZWNyZXQubmFtZSI6InN2Yy1kdGUtYmFtYm9vLXByb2QtdG9rZW4taGxsdjgiLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC5uYW1lIjoic3ZjLWR0ZS1iYW1ib28tcHJvZCIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VydmljZS1hY2NvdW50LnVpZCI6ImExYjY1ZTgxLTExZDQtMTFlYS05MGE0LTAwNTA1NmIxMjU5ZSIsInN1YiI6InN5c3RlbTpzZXJ2aWNlYWNjb3VudDpkZWZhdWx0OnN2Yy1kdGUtYmFtYm9vLXByb2QifQ.aSmLb64lv7vQ12oF7XCCjMgr6yqaWOqrDaF8_UO7pUYAYlR_2zdLGLqjpsOtdX7WKdxAVtK5XbjhbLPLBqM4v4plL24VjJMgBsYgKCvdN-sMOuwZ4F4k4VyaCJsK6gdkiVTXe56WQ_WJf4aSwkdlHtVm2qB5KIJt_vdERB23qGTJY61YExY1ExbPnPdy5NABDnMwbIWXWVajbpFIklINO-NPeqyqci_rIDz4q6lVt4RM9PbmOpywtpl0bvNZejzlpAMI14ePTT7ObOvYX3IFDFQy9LBQwjGxTTmLpHqFs-JyT955kFt6jsw0TBuc1aPcKcQUgUlrVcnz7sCwhY_TsA

oc project idna-cis-fusebusinessobject-dev

oc create secret generic svc-cus-cache-dev-keytab --from-file=./SVC_CST_CusCache_dev.keytab

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
