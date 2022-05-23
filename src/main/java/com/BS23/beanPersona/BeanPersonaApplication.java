package com.BS23.beanPersona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanPersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanPersonaApplication.class, args);
	}


	@Bean("bean1")
	public Persona persona1() {
		Persona persona1 = new Persona();
		persona1.setNombre("amigo1");
		return persona1;
	}
	@Bean("bean2")
	public Persona persona2() {
		Persona persona2 = new Persona();
		persona2.setNombre("amigo2");
		return persona2;
	}
	@Bean("bean3")
	public Persona persona3() {
		Persona persona3 = new Persona();
		persona3.setNombre("amigo3");
		return persona3;
	}
}
