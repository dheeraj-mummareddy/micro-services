# Micro Service Testing using Gatling

Sorry, this repository is not being maintained, latest version of Gatling has support for feeders (to feed input json), do checkout Gatling's website.

Building the User Microservice Jar File
----------------------------------------
Step 1 : Change to directory to  micro-services/ecommerce-microservices/user-microservice

Step 2 : Run $ mvn package

Step 3 : The above will create a JAR in the target directory

Building jar: target/user-microservice-0.0.1-SNAPSHOT.jar

Running the User Microservice (JAR)
--------------------------------------
 $ java -jar target/user-microservice-0.0.1-SNAPSHOT.jar
 
 Alternatively -  You can compile and run in on go using  $ mvn -q clean spring-boot:run
 ----------------------------------------------------------------------------------------
 
 Test the Microservice 
 ----------------------
 Step 1 : Open the URL from a browser - http://localhost:9001/users
 
 
Running the Gatling test using Maven
-------------------------------------
Step 1 : Open another command prompt

Step 2 : Change to directory micro-services/tests/user-microservice-gatling-tests

Step 3 : mvn clean gatling:execute

courtesy @adhulappanavar
