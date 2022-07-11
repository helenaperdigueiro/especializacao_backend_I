FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/gateway.jar
COPY ${JAR_FILE} gateway.jar
ENTRYPOINT ["java", "-jar", "gateway.jar"]
EXPOSE 8080