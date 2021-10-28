package tn.esprit.reclamation;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class ReclamationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReclamationApplication.class, args);
    }

    Reclamation reclamation1 = new Reclamation("vol","n est pas satisfaisant",false, 1 );
    Reclamation reclamation2 = new Reclamation("hotel","n est pas satisfaisant",false, 1 );
    Reclamation reclamation3 = new Reclamation("transport","n est pas satisfaisant",false, 1 );

    @Bean
    ApplicationRunner init(ReclamationRepository repository) {
        return args -> {
            Stream.of(reclamation1, reclamation2, reclamation3).forEach(reclamation -> {
                repository.save(reclamation) ;
            });
            repository.findAll().forEach(System.out :: println);
        } ;
    }
}
