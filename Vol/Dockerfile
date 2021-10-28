FROM java:8
EXPOSE 8089
ADD /target/vol-0.0.1-SNAPSHOT.war vol.jar
ENTRYPOINT ["java","-jar","vol.jar"]