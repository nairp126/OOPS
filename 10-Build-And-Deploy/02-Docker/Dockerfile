# Stage 1: Build the Application
# Use a Maven image to compile the code
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the project files
COPY pom.xml .
COPY src ./src

# Build the JAR (skip tests for speed in this demo)
RUN mvn clean package -DskipTests

# Stage 2: Run the Application
# Use a lightweight JRE image for production
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy only the compiled JAR from Stage 1
COPY --from=build /app/target/java-oop-course-1.0-SNAPSHOT.jar app.jar

# Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
