# 🏗️ Challenge: The "It Won't Run!" Mystery

**Topic**: Build & Deploy (JARs, Manifests, Docker)

## 📝 Problem Statement

You just built your Java app using `mvn package`.
It created a file called `myapp.jar`.
You excitedly send it to the client.
They try to run it: `java -jar myapp.jar`.

**ERROR**: `no main manifest attribute, in myapp.jar`

Your task is to identify WHY this happened and HOW to fix the `pom.xml` to prevent it.

---

## 🕵️ The clues (Starter Code)

Here is your broken `pom.xml` snippet. It is missing the specific plugin that tells the JAR where "Main" is.

```xml
<build>
    <plugins>
        <!-- Standard Compiler -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
        </plugin>
        
        <!-- TODO: Add the 'maven-shade-plugin' or 'maven-assembly-plugin'
             or configure 'maven-jar-plugin' to set the manifest! -->
    </plugins>
</build>
```

---

## ✅ Acceptance Criteria

1. **Explanation**: You must be able to explain that a standard JAR is just a ZIP file, and without a `MANIFEST.MF` pointing to a Main Class, Java doesn't know where to start.
2. **The Fix**: You need to find the XML configuration for the **Maven Shade Plugin** (or similar) that sets the `Main-Class` attribute.
3. **Docker Bonus**: If running in Docker, you would define the entry point as `ENTRYPOINT ["java", "-jar", "myapp.jar"]`. Does Docker need a manifest? (Yes, it still fails if the JAR is broken!).
