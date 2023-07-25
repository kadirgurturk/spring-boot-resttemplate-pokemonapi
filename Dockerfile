FROM openjdk:17
EXPOSE 8085
ARG JAR_FILE=target/PoekmonRestTemplate-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} poke.jar
ENTRYPOINT ["java", "-jar", "/poke.jar"]