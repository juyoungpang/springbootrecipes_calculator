package com.apress.springbootrecipes_calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	// @Bean
	// public ApplicationRunner calculationRunner(Calculator calculator) {
	// 	return args -> {
	// 		calculator.calculate(137, 21, '+');
	// 		calculator.calculate(137, 21, '*');
	// 		//calculator.calculate(137, 21, '-');
	// 	};
	// }

	@Bean
	public ApplicationRunner calculationRunner (Calculator calculator, 
												@Value("${lhs}") int lhs,
												@Value("${rhs}") int rhs,
												@Value("${op}") char op) {
			return args -> calculator.calculate(lhs, rhs, op);
	}
}
