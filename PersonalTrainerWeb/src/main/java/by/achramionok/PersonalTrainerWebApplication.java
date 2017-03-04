package by.achramionok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PersonalTrainerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalTrainerWebApplication.class, args);
	}
}
