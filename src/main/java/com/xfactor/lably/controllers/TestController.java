package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.xfactor.lably.entity.Lab;
import com.xfactor.lably.entity.Admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    ArrayList<Lab> labs = new ArrayList<>();

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String hello() {
        return "Greetings from XFACTOR!!!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Greetings from " + name + "!!!";
    }

    @GetMapping("/hello2")
    public String helloName2(@RequestParam String name, @RequestParam String age) {
        return "Greetings from hello2 " + name + "!!!" + age;
    }

    @GetMapping("/hello3")
    public Map<String, String> helloName3(@RequestParam String name, @RequestParam String age) {
        Map<String, String> respoMap = new HashMap<>();
        respoMap.put("name", name);
        respoMap.put("age", age);
        return respoMap;
    }

    @GetMapping("/hello4")
    public ArrayList helloName4(@RequestParam String name, @RequestParam String age) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(name);
        arrayList.add(age);
        return arrayList;
    }

    @GetMapping("/getLabs")
    public ArrayList<Lab> getLabs() {
        return labs;
    }

    @PostMapping("/addLab")
    public Lab addLab(@RequestBody Lab lab) {
        String name = lab.getName();
        name = "Hello " + name;
        lab.setName(name);
        labs.add(lab);
        return lab;
    }

    // // http://localhost:8080/test/hello/xfactor
    // @GetMapping("/hello/{name}")
    // @ResponseBody
    // public String index_greetings(@PathVariable String name) {
    // return "Greetings :" + name;
    // }

    // // http://localhost:8080/test/hello2?id=16
    // @GetMapping("/hello2")
    // @ResponseBody
    // public String getFoos(@RequestParam String id) {
    // return "ID: " + id;
    // }

    // @PostMapping("/employees")
    // Employee newEmployee(@RequestBody Employee newEmployee) {
    // return repository.save(newEmployee);
    // }

    @GetMapping("/register")
    public Admin register(@RequestParam String name, @RequestParam String username, @RequestParam String password,
            @RequestParam String department) {
        // HashMap<String, String> resp = new HashMap<>();
        // resp.put("name", name);
        // resp.put("username", username);
        // resp.put("password", password);
        // resp.put("department", department);
        // return resp;
        Admin admin1 = new Admin();
        admin1.setName(name);
        admin1.setUsername(username);
        admin1.setPassword(password);
        admin1.setDepartment(department);
        return admin1;
    }

}
