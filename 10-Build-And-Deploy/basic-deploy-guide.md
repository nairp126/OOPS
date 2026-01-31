# 🚀 Build & Deployment Guide

## 1. Building with Maven

Maven manages your dependencies (like JUnit) and compiles your code into a JAR file.

**Command**:

```bash
mvn clean install
```

* `clean`: Deletes the `target/` folder (removes old builds).
* `install`: Compiles, Tests, and Packages your app into a `.jar`.

## 2. Running the JAR

Once built, you can run your application anywhere that has Java installed.

**Command**:

```bash
java -jar target/java-oop-course-1.0-SNAPSHOT.jar
```

## 3. Containerizing with Docker

Docker allows you to package your app AND the Java environment together. This ensures it runs the same on your laptop and the cloud.

**Build the Image**:

```bash
docker build -t java-mastery-app .
```

**Run the Container**:

```bash
docker run -it java-mastery-app
```
