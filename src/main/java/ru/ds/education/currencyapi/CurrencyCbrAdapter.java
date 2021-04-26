package ru.ds.education.currencyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
public class CurrencyCbrAdapter {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCbrAdapter.class, args);
	}

}
