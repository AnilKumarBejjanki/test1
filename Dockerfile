FROM openjdk:18
EXPOSE 8080
ADD target/spring-boot-docker-test.jar spring-boot-docker-test.jar
ENTRYPOINT [ "java","-jar","/spring-boot-docker-test.jar" ]