FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y maven netcat

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

WORKDIR /usr/src/app
RUN mvn clean package

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

COPY waiting.sh /waiting.sh
RUN chmod +x /waiting.sh

CMD /waiting.sh && java -jar /app.jar