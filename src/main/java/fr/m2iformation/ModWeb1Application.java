package fr.m2iformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"fr.m2iformation"})
@EntityScan("fr.m2iformation")
public class ModWeb1Application {

	public static void main(String[] args) {
		SpringApplication.run(ModWeb1Application.class, args);
	}
}
