FROM openjdk:17-jdk-slim

# instalei o netcat pra possibilitar a execução do script waiting.sh
RUN apt-get update && apt-get install -y netcat

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

COPY waiting.sh /waiting.sh
RUN chmod +x /waiting.sh

CMD /waiting.sh && java -jar /app.jar
