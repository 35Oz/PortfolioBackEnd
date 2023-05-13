FROM amazoncorretto:18-alpine-jdk 
MAINTAINER EZE 
COPY target/ezeq-0.0.1-SNAPSHOT.jar eze-app.jar
ENTRYPOINT ["java","-jar","/eze-app.jar"]
EXPOSE 8080