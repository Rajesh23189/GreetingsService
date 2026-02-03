package com.Rajesh.SpringBootApplication2.main;

import com.Rajesh.SpringBootApplication2.Services.GreetingsServices;
import com.Rajesh.SpringBootApplication2.Services.IGreetings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(Main.class, args);
		IGreetings greetingsServices =container.getBean(IGreetings.class);

		System.out.println(greetingsServices.generatedWish("Kuheli"));

	}

}
