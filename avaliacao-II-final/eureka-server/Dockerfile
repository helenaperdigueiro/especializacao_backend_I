FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/eurekaserver.jar
COPY ${JAR_FILE} eureka.jar
ENTRYPOINT ["java", "-jar", "eureka.jar"]
EXPOSE 8761