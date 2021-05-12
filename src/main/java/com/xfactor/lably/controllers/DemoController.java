package com.xfactor.lably.controllers;


import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController{


    @GetMapping("/hello")
    public String hello(){
        return "Hello from demo controller";
    }


    @GetMapping("/hello1")
    public String greet(){
        return "Greetings from demo controller";
    }

    // @GetMapping()
    // public String greet1()
    // {
    //     return "hello from only class level mapping";
    // }

    // @GetMapping("/hello2/{name}")
    // public String greet2(@PathVariable String name){
    //     return "Greetings from "+ name+" !!!";
    // }

    // @GetMapping("/hello3")
    // public String greet3(@RequestParam String name, @RequestParam String age){
    //     return "Greetings from "+ name+ age +" !!!";
    // }

    @GetMapping("/hello4")
    public HashMap<String , String> greet4 (@RequestParam String name, @RequestParam String age){
        HashMap<String , String> resp=new HashMap<>();
        resp.put(name, name);
        resp.put(age, age);

        return resp;
    }




}