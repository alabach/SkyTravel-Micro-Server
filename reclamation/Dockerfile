FROM openjdk:8
EXPOSE 8088
ADD /target/reclamation-0.0.1-SNAPSHOT.war reclamation.jar
ENTRYPOINT ["java","-jar","reclamation.jar"]