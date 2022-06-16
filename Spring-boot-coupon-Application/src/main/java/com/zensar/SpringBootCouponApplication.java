package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zensar"})
public class SpringBootCouponApplication {

	public static void main(String[] args) {
		System.out.println("Raghav");
		SpringApplication.run(SpringBootCouponApplication.class, args);
		System.out.println("Battula");
	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
