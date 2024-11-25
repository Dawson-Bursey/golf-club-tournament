# Use a slim OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Copy the built JAR file into the container
COPY target/golf-club-tournament-0.0.1-SNAPSHOT.jar golf-club-tournament.jar

# Set the entrypoint to run the application
ENTRYPOINT ["java", "-jar", "golf-club-tournament.jar"]
