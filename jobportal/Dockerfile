# 1) Build stage: use Maven + JDK to build the jar
FROM maven:3.8.6-eclipse-temurin-17 AS build

WORKDIR /workspace

# Copy pom + source code
COPY pom.xml .
COPY src ./src

# Build your Spring Boot app (skip tests to speed up)
RUN mvn clean package -DskipTests

# 2) Run stage: use a lighter JDK image
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy jar from the build stage
COPY --from=build /workspace/target/*.jar app.jar

# Expose port (Render will provide PORT env var)
EXPOSE 4336

# Run your Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
