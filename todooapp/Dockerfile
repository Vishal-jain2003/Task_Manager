# Use the official OpenJDK 21 image from Docker Hub
FROM openjdk:21-jdk-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the local code to the container
COPY . .

# Build the Spring Boot application (Assuming you are using Maven)
# If you're using Gradle, replace the following line with gradle build command
RUN ./mvnw clean package -DskipTests

# Now, create the final image with the application
FROM openjdk:21-jdk-slim

# Set the working directory for the final image
WORKDIR /app

# Copy the JAR file built in the previous stage to the final image
COPY --from=build /app/target/todooapp-0.0.1-SNAPSHOT.jar /app/todooapp.jar

# Expose port 8080 (default Spring Boot port)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "todooapp.jar"]
