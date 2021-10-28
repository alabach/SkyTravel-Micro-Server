FROM java:8
EXPOSE 8084
ADD /target/transport-0.0.1-SNAPSHOT.war transport.jar
ENTRYPOINT ["java", "-jar", "transport.jar"]