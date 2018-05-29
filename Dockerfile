FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/skill-quadrant-back-0.0.1.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
CMD echo "App is running"