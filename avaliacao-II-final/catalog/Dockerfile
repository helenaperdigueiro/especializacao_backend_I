FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/catalog.jar
COPY ${JAR_FILE} catalog.jar
ENTRYPOINT ["java", "-jar", "catalog.jar"]
EXPOSE 8088