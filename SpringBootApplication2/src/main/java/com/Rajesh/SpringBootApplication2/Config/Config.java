package com.Rajesh.SpringBootApplication2.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


import java.time.LocalTime;

@Configuration
public class Config {

    public Config()
    {
        System.out.println("Config Bean Created");
    }

    @Bean
    public LocalTime CreateTime()
    {
        return LocalTime.now();
    }

}
