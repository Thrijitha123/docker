FROM openjdk:13-jdk-alpine
ADD target/doc.jar doc.jar
ENTRYPOINT ["java","-jar","doc.jar"]