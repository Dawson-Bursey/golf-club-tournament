FROM openjdk:17-jdk-slim
COPY target/golf-club-tournament-0.0.1-SNAPSHOT.jar golf-club-tournament.jar
ENTRYPOINT ["java", "-jar", "golf-club-tournament.jar"]
