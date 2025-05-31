# backend/Dockerfile
FROM openjdk:24-jdk-slim

WORKDIR /app

# Copy entire backend folder to container
COPY . .

RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/app.jar"]

