package com.qeema.qeema_project.controller;
import com.qeema.qeema_project.calsses.user;
import org.springframework.beans.factory.annotation.Autowired;
import com.qeema.qeema_project.services.user_services;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class controller_user {
    user_services user_services;
    @Autowired

    public controller_user(com.qeema.qeema_project.services.user_services user_services) {
        this.user_services = user_services;
    }

    @PostMapping("/user")
    public user create_user(@RequestBody user user) {


        return user_services.create_user(user);
    }
}
