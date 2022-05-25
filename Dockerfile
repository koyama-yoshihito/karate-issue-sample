FROM openjdk:8-jdk-alpine

COPY . .
ENTRYPOINT ["sh", "./gradlew", "bootRun"]
