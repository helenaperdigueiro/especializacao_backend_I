FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/serverconfig.jar
COPY ${JAR_FILE} serverconfig.jar
ENTRYPOINT ["java", "-jar", "serverconfig.jar"]
EXPOSE 8888