FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/skill-quadrant-back-0.0.1.jar /app.jar
CMD java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar