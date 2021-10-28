package tn.esprit.facture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FactureApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactureApplication.class, args);
    }

    @Bean
    ApplicationRunner init (FactureRepository repository) {
        return args -> {
            repository.save(new Facture(120, "fact","20/10/2021", 5));
        };

    };
}
