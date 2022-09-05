package com.example.GoodAfternoonChristmas.controller;

import com.example.GoodAfternoonChristmas.models.GreetingPOJO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //Identifies this class as a restful API Controller

    @RequestMapping (value ="/POJOgreetings")
public class GreetingController {
@GetMapping

public GreetingPOJO newGreeting(){
    GreetingPOJO greeting= new GreetingPOJO("tom", 2312);
    return new GreetingPOJO("tom", 2312);
}
@GetMapping ("realtime")
    public String newtimes(@RequestParam  (value= "time") String time ){
    return "the time is " + time;
    }
//public String greeting (@RequestParam  (value = "name")String name
//){
//    return "Hi there "+ name;
//}
}