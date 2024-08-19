package springBoot.Dto.dto;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DtoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DtoApplication.class, args);
	}

	//update model mapper
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();

	}
}