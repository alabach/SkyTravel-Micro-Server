FROM openjdk:8
EXPOSE 8081
ADD /target/hotel-0.0.1-SNAPSHOT.war hotel.jar
ENTRYPOINT ["java","-jar","hotel.jar"]