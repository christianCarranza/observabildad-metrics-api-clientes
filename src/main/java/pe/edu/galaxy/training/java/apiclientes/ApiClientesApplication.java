package pe.edu.galaxy.training.java.apiclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApiClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClientesApplication.class, args);
	}

}
