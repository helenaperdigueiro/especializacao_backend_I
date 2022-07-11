FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/movie.jar
COPY ${JAR_FILE} movie.jar
ENTRYPOINT ["java", "-jar", "movie.jar"]
EXPOSE 8087