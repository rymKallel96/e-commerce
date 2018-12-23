package insat.commerce.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import insat.commerce.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("insat.commerce.repository")
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}
    @Bean
	public CommandLineRunner demo (ClientRepository clRepository) {
		return (args) -> {
			// save a couple of customers
			clRepository.save(new Client("rym","kallelrym156@gmail.com"));
            clRepository.save(new Client("melek","melekmarzouki@gmail.com"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");

			log.info("");


		};
	}
}
