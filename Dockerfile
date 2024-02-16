FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/tester-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080