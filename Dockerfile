FROM openjdk:8
EXPOSE 8080
ADD target/ecomjenkins.jar ecomjenkins.jar
ENTRYPOINT ["java", "-jar", "/ecomjenkins.jar"]