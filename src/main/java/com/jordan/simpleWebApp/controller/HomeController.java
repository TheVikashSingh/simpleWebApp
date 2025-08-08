package com.jordan.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String welcomeMessage(){
        List<String> namaste = new ArrayList<>();
        namaste.add("Welcome Saarr!\n");
        System.out.println(namaste);
        return "Welcome to Jordan's website!";
    }

    @RequestMapping("/about")
    public StringBuilder aboutme(){
        int i=0;
        StringBuilder strb = new StringBuilder();
        while(i!=10){
            strb = strb.append("Jordan is great!!!" +'\n') ;
            i++;
        }
        return strb;
    }

}

