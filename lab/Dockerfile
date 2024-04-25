# Build stage for Maven
FROM maven:3.8.3-openjdk-8 AS build
WORKDIR /app
COPY pom.xml .
COPY src/ src/
RUN mvn -B clean package

# Final stage for running the application
FROM openjdk:8
WORKDIR /app
COPY --from=build /app/target/LabApp.jar LabApp.jar
ENTRYPOINT ["java", "-jar", "LabApp.jar"]
EXPOSE 22
