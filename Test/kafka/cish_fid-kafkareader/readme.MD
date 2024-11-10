# **Kafka Reader**

## **Purpose**
This app reads messages from EEH kafka instance and sends the messages to Active MQ.

## **Running on DEV**
To run the app on our linux DEV environment you will need to do the following.

* Upload your version of kafkareader-{version}.jar into the dev environment
* Execute the jar by running the the following command : java -jar kafkareader-{version}.jar --spring.config.location=classpath:/application-dev.yaml


## **Running on your local machine**
To run the app on your local machine you will need to do the following.

* Follow the instructions here to run Kafka and Zookeeper on your local machine https://kafka.apache.org/quickstart
* Download and run the latest version of Active MQ from http://activemq.apache.org/components/classic/download/  
* Build your version of kafkareader-{version}.jar
* Execute the jar by running the the following command : java -jar  kafkareader-{version}.jar --spring.config.location=classpath:/application-local-dev.yaml

##**ActiveMQ changes**
How to configure the broker to use TLS SSL 
1.	GO to the activemq config file - activemq.XML file
Add below line under the transport connectors 
              <transportConnector name="tls" uri="ssl://0.0.0.0:61617?maximumConnections=1000&amp;wireFormat.maxFrameSize=104857600"/>

2.	Add below sslContect statements after the transport connections section :-
a.	<sslContext> 
                                             <sslContext keyStore="file:${activemq.conf}/brokerKeyStore.jks" 
                                                                                          keyStorePassword="password" 
                                                                                          trustStore="file:${activemq.conf}/brokerTrustStore.jks" 
                                                                                          trustStorePassword="password"/> 
                              </sslContext>


3.	Create a broker trust and key stores and Client key and trust stores for the applications to run   
a.	openssl.exe pkcs12 -export -in ActiveMQ.pem -inkey ActiveMQ.key -out broker.p12 -name "broker"
b.	openssl.exe pkcs12 -export -in ActiveMQ.pem -inkey ActiveMQ.key -out client.p12 -name "client"
c.	keytool.exe" -importkeystore -srckeystore broker.p12 -srcstoretype pkcs12 -destkeystore brokerKeyStore.jks
d.	 keytool.exe" -importkeystore -srckeystore client.p12 -srcstoretype pkcs12 -destkeystore clientKeyStore.jks
e.	openssl.exe x509 -outform der -in fsr_ca.pem -out fsr_ca.der
f.	keytool.exe" -importcerts -alias fsrRoot -keystore broker.ts -file fsr_ca.der

##**Application config yml changes**
1.	Change the application.yml files for the kafka readers  activemq: broker-url to failover://ssl://localhost:61617

entrypoint.sh changes

java -jar -Djavax.net.ssl.keyStore=C:\custCache\clientKeyStore.jks -Djavax.net.ssl.keyStorePassword=password kafkareader-{version}.jar --spring.config.location=classpath:/application-local-dev.yaml
