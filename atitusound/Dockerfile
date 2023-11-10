# Use the official OpenJDK 17 JDK slim image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at the specified path
COPY target/$(JAR_FILE) /app/app.jar

# Other dependencies or resources can be copied if needed
# COPY src/main/resources /app/resources

# Expose the port the application runs on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "app.jar"]
