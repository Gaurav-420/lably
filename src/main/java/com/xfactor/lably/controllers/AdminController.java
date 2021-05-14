package com.xfactor.lably.controllers;

import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import com.xfactor.lably.entity.Admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/admin")
public class AdminController {

    ArrayList<Admin> admins = new ArrayList<>();

    

    @PostMapping("/addAdmin")
    public Admin registerPost(@RequestBody Admin admin) {
        admin.setId(UUID.randomUUID().toString());
        admins.add(admin);
        return admin;
    }

    @GetMapping("/getAllAdmins")
    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    @GetMapping("/search")
    public Admin search(@RequestParam String username) {
        Admin temp = null;
        for (Admin admin : admins) {
            if (admin.getUsername().equalsIgnoreCase(username)) {
                temp = admin;
            }
        }
        return temp;
    }

}