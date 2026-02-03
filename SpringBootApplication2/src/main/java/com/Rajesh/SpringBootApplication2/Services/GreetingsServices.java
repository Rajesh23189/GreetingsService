package com.Rajesh.SpringBootApplication2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;



import java.time.LocalTime;

@Service
public class GreetingsServices implements IGreetings{

    public GreetingsServices()
    {
        System.out.println("Greeting Service Bean Created");
    }

    @Autowired
    private LocalTime localTime;


    @Override
    public String generatedWish(String name)
    {

        int hour = localTime.getHour();
        if(hour > 4 &&hour < 12)
        {
           return "Good Morning  "+name+"! Time Now :"+hour+"AM";
        }
        else if (hour < 16) {
            return "Good AfterNoon  "+name+"! Time Now :"+hour+"PM";
        }
        else if (hour<20) {
            return "Good Evening  "+name+"! Time Now :"+hour+"PM";
        }
        else{
            if(hour > 24)
            {
                return   "Good Night  "+name+"! Time Now :"+hour+"PM";
            }
            else
            {
                return   "Good Night  "+name+"! Time Now :"+hour+"AM";
            }

        }
    }


}
