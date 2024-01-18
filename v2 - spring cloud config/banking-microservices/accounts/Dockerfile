#Start with the base image containing Java runtime
FROM openjdk:17-jdk-slim

#Information about who maintains the image
MAINTAINER aspl.com

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Excute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]