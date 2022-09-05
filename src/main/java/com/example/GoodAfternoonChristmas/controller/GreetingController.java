package com.example.GoodAfternoonChristmas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //Identifies this class as a restful API Controller
public class GreetingController {


@GetMapping("greeting")
public String greeting (@RequestParam  (value = "name")String name
){
    return "Hi there "+ name;
}
}