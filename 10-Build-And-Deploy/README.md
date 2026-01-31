# 10-Build-And-Deploy

Writing code is only half the battle. Delivering it to users is the other half.
This module covers how to **Package** your code (Maven) and **Ship** it (Docker).

## 📦 Concepts

### 1. Maven (The Builder)

**Concept**: A tool that manages external libraries (Dependencies) and builds your project.
**Why**: Manually downloading `.jar` files and adding them to the classpath is painful and error-prone. Maven does it automatically via `pom.xml`.

### 2. JAR (Java ARchive)

**Concept**: A ZIP file containing all your compiled `.class` files and metadata.
**Manifest**: The `MANIFEST.MF` file inside the JAR tells Java which class contains the `public static void main` method to start execution.

### 3. Docker (The Shipper)

**Concept**: Putting your JAR inside a lightweight Linux box (Container).
**Why**: "It works on my machine" is not an excuse. Docker ensures your app runs exactly the same way on a developer's laptop, a QA server, and the Production cloud.

---

## 📂 Code Walkthrough

| File | Concept | Description |
|------|---------|-------------|
| [pom.xml](./01-Maven/pom.xml) | **Maven Config** | Defines dependencies (JUnit, Mockito) and build plugins. |
| [Dockerfile](./02-Docker/Dockerfile) | **Container** | A recipe to build a Linux image containing your Java app. |
| [AppManifest.txt](./03-Jar/AppManifest.txt) | **Manifest** | How to define the entry point of your application. |

---

## 🙋‍♀️ Interview Questions

### Q1: What is the difference between `mvn install` and `mvn package`?

**Answer**:

- `package`: Compiles code and verifies tests, then builds the JAR in your `target/` folder.
- `install`: Does everything `package` does, PLUS it copies that JAR to your local `~/.m2` repository so other local projects can use it.

### Q2: Why do we use Multi-Stage Builds in Docker?

**Answer**: To keep the final image small. We use a heavy JDK image to *compile* the code (Stage 1), but we copy only the final JAR to a tiny JRE image (Stage 2) for *running* it. This saves hundreds of megabytes.

### Q3: What is the `uber-jar` (or Fat JAR)?

**Answer**: A JAR that contains your code PLUS all your dependencies (like SLF4J, Mockito) bundled inside it. Ideally used for easy deployment (just run one file).
