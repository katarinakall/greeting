FROM openjdk:8
ADD target/docker-greeting.jar docker-greeting.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "docker-greeting.jar"]