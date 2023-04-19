FROM openjdk:19-slim as build

COPY target/cruddemo-0.0.1-SNAPSHOT.jar cruddemo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/cruddemo-0.0.1-SNAPSHOT.jar"]