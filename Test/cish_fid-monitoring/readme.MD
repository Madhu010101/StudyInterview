# **Customer Cache ReadApi**
# **Purpose**
This App provides a view into the Customer Cache Database. This should be /deployed/ran first because it contains flyway DB scripts

## **Running on your local machine**
To run the App on your local machine for the first you will need to do the following. 

* Install PostgreSQL database(**You will need Windows Admin rights**) and create a user :postgres , with password : password
* Create a database named cstdb
* Build the project and run the ReadApiApplication.java file
* Build and run app-properties
* Navigate to http://localhost:8080/cuscache/swagger-ui.html, if all is good you should be able to see the swagger html page.