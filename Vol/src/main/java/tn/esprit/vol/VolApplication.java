package tn.esprit.vol;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class VolApplication {

    public static void main(String[] args) {
        SpringApplication.run(VolApplication.class, args);

    }
    @Bean
    ApplicationRunner init ( VolRepository repository) {
        return args -> {
            repository.save(new Vol(1, "hell", true,"direct","tunis", "paris"));
        };

    };
}
