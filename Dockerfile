FROM openjdk:17-jdk-alpine
 
ENV APP_REFERENCE_JAR=target/user-api.jar
ENV APP_NAME=user-api.jar
 
COPY ${APP_REFERENCE_JAR} ${APP_NAME}
ENTRYPOINT java -jar ${APP_NAME}

EXPOSE 8081