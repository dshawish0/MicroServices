FROM openjdk:18-alpine

ADD target/*.jar app.jar

EXPOSE 4001

ENTRYPOINT ["java", "-jar", "app.jar"]