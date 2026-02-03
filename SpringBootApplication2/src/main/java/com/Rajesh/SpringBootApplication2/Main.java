package com.Rajesh.SpringBootApplication2;

import com.Rajesh.SpringBootApplication2.Services.GreetingsServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(Main.class, args);
		GreetingsServices greetingsServices =container.getBean(GreetingsServices.class);

		System.out.println(greetingsServices.generatedWish("Kuheli"));

	}

}
