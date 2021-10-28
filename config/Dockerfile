FROM java:8
EXPOSE 8005
ADD /target/config-0.0.1-SNAPSHOT.war config.jar
ENTRYPOINT ["java", "-jar", "config.jar"]