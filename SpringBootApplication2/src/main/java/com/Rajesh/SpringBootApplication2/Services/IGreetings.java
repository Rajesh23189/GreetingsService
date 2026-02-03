package com.Rajesh.SpringBootApplication2.Services;
import org.springframework.context.annotation.Configuration;



@Configuration
public interface IGreetings {
    String generatedWish(String Name);
}
