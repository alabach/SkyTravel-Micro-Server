FROM java:8
EXPOSE 8031
ADD /target/facture-0.0.1-SNAPSHOT.war facture.jar
ENTRYPOINT ["java","-jar","facture.jar"]