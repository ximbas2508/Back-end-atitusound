FROM openjdk:17-jdk-slin
ARG JAR_FILE-app/*
COPY $(JAR_FILE) app.jar
EXPOSE 8080 '
ENTRYPOINT ("java", ".jar","/app.jar")