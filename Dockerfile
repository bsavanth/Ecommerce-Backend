FROM openjdk:18.0
EXPOSE 8080
ADD target/spring-boot-ecommerce-0.0.1-SNAPSHOT.jar spring-boot-ecommerce-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-ecommerce-0.0.1-SNAPSHOT.jar"]