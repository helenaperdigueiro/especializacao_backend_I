FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/serie.jar
COPY ${JAR_FILE} serie.jar
ENTRYPOINT ["java", "-jar", "serie.jar"]
EXPOSE 8089