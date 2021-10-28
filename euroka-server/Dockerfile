FROM java:8
EXPOSE 8761
ADD /target/euroka-server-0.0.1-SNAPSHOT.war euroka-server.jar
ENTRYPOINT ["java", "-jar", "euroka-server.jar"]
