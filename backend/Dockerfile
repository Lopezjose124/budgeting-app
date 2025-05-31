# Use an official OpenJDK image as a base
FROM openjdk:24-jdk-slim

# Copy everything inside of the app directory
COPY /budgeting-app
# Set the working directory
WORKDIR /budgeting-app

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
