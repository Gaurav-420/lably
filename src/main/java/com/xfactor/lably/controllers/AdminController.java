package com.xfactor.lably.controllers;

import org.springframework.web.bind.annotation.RestController;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.List;

import com.xfactor.lably.entity.Admin;
import com.xfactor.lably.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    AdminRepository adminRepository;

    @GetMapping()
    public String greet(){
        return "Hello from Admin !!!";
    }

    

    @PostMapping("/addAdmin")
    public Admin registerPost(@RequestBody Admin admin) {
        // admin.setId(UUID.randomUUID().toString());
        // Save admin to db
        Admin persistedAdmin = adminRepository.save(admin);

        return persistedAdmin;
    }

    @GetMapping("/getAllAdmins")
    public List<Admin> getAdmins() {
        // return admins;
       List<Admin> persistedAdmin= adminRepository.findAll();
       return persistedAdmin;
    }

    @GetMapping("/getAdminByUserName")
    public Admin getAdminByUserName(@RequestParam String username) {
        Admin resAdmin = null;
        for (Admin admin : admins) {
            if (admin.getUsername().equalsIgnoreCase(username)) {
                resAdmin = admin;
            }
        }
        return resAdmin;
    }

}