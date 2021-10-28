package tn.esprit.transport;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class TransportApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransportApplication.class, args);
    }

    @Bean
    ApplicationRunner init (TransportRepository repository) {
        return args -> {
            repository.save(new Transport("24/24", 55,"Paris_Orly","Hilton", 5));
        };

    };


}
