### Micro services application for a travel agency management with SpringBoot, Node js, MongoDB, MySQL, H2, SpringCloud, Eureka-Netflix, Zuul and Docker :star2: :star2: :star2: :star2: :star2: 
     
----
### We Will make it together step by step : 

* Creation of the MicroServices : 
    1. SpringBoot / H2 database 
    2. SpringBoot / MySQL database
    3. Node js - Express js / MongoDB 

* Deployement of the Microservices on Eureka-Netflix server. 
* Gateway configuration with Zuul. 
* Configuring the SpringCloud config server.
* Dockerizing the Microservices, Eureka-Netflix server, Zuul & server config.  


**** 

#### First of all, let's start with creating the SpringBoot/H2 Microservice 

 #####  I. Create a SpringBoot project adding these 7 dependencies : 
           1.  Spring Boot Actuator
           2.  Spring Data JPA 
           3.  Rest Repositories 
           4.  Spring Web 
           5.  H2 Database
           6.  Eureka Discovery Client
           7.  Config Client

#####   II. Create you Entity file ( this is an example that you can follow ) : DON'T FORGET TO ADD THE ANNOTATIONS & GENERATE YOUR GETTERS/SETTERS 

![entites](https://user-images.githubusercontent.com/57329406/138796308-3ba8d323-2ca8-435a-95ca-2a01e99c4abd.png) 

#####   III. Create your Repository INTERFACE ( this is an example that you can follow ) : DON'T FORGET TO ADD THE @Repository 

![Repos](https://user-images.githubusercontent.com/57329406/138797224-323af116-8cfc-4381-ab73-87eca8b04127.png)

#####   IV. Create your SERVICES CLASS TO WRITE YOUR CRUD ( this is an example of simple CRUD creation that you can follow ) : DON'T FORGET TO ADD THE @Service 

![crud](https://user-images.githubusercontent.com/57329406/138797929-abb56301-189f-4785-8ca0-3b3d9c5800fb.png)

#####   V. Create your RestApi Class to write your Mappings ( this is an example that you can follow ) : DON'T FORGET TO ADD THE ANNOTATIONS

![REST](https://user-images.githubusercontent.com/57329406/138798966-66edbc37-ac5c-420e-a8fc-d5d0b23d50cb.png)

#####   VI. Configure your application properties ( this is an example that you can follow ) :

![app prop](https://user-images.githubusercontent.com/57329406/138799659-c2752080-4c8f-4cba-9a7f-da16664944ba.png)

#####  &#8594; Once you finished these steps, Start your application, try your Rest APIs on Postman & then check your H2 Database to be sure that your first mission is accomplished :muscle:

**** 

#### Second, after creating the microservices, let's start to deploy our Microservices on the famous Eureka-Netflix server

 #####  I. Create a EurekaServer SpringBoot project with ONLY Eureka Server as dependency 

 #####  II. Add @EnableEurekaServer to you application class

 #####  III. Configure your application properties ( this is an example that you can follow ) : 

 ![eurekaprop](https://user-images.githubusercontent.com/57329406/138803790-823d08c7-b530-4edf-8c6e-5109f5ef2609.png)

#####   IV. Add @EnableDiscoveryClient to the Microservices' application classes 

#####   V. Add Eureka to your Microservices properties ( this is an example that you can follow ) :

![eurekmicro](https://user-images.githubusercontent.com/57329406/138804250-d660c4b9-caa6-45f3-943a-b3981b034595.png)

#####  &#8594; Once you finished these steps, Start your Eureka server AND THEN your application, open [Eureka](http://localhost:8761/)  to be sure that your second mission is accomplished and your Microservices are deployed on Eureka :muscle: :muscle:

*** 

#### Now, Let's try these same steps but with a Node js, Express js and MongoDB Microservice :point_right: 

 #####  I. But first, let's understand a little about how this process is gonna work : 

![eureka-js-client (1)](https://user-images.githubusercontent.com/57329406/138805069-1669afd9-0f64-4a1a-960d-ae7c9b80a546.jpg)

 #####  II. Okay, let's suppose that you already prepared you Node js application ( Models &#8594; server &#8594; database &#8594; routes ). If not, watch this simple [demo](https://www.youtube.com/watch?v=W1Kttu53qTg) of how you can create one.

 #####  III. Add Eureka Client to a Node application ( this is an example that you can follow ) : 

![eureka node](https://user-images.githubusercontent.com/57329406/138805830-9bef7bc1-bbce-423d-bd18-5340d9c3e0ce.png)

#####   IV. Register with Eureka in you server.js file :

![register](https://user-images.githubusercontent.com/57329406/138805978-c6749256-ecea-4c5f-972c-82141e4009ee.png)

#####  &#8594; Once you finished these steps, Start your node application ( it will start Eureka with it ), open [Eureka](http://localhost:8761/)  to be sure that your mission is accomplished and your Microservice is deployed on Eureka :muscle: :muscle: :muscle:

***

#### NEXT STEPS ( ZUUL, SPRINGCLOUD & DOCKER ) ARE COMING SOON WITH A GREAT EXPLANATION, IT'S JUST A MATTER OF TIME. SEE YOU SOON DEVELOPERS :eyes:










