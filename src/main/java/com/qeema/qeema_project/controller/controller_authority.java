package com.qeema.qeema_project.controller;

import com.qeema.qeema_project.calsses.authority;
import com.qeema.qeema_project.calsses.user;
import com.qeema.qeema_project.services.user_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qeema.qeema_project.services.authority_services;

@RestController
@RequestMapping("/api")
public class controller_authority {
    authority_services authority_services;
    @Autowired

    public controller_authority(authority_services authority_services) {
        this.authority_services = authority_services;
    }

    @PostMapping("/authority")
    public authority create_authority(@RequestBody authority authority) {

        return authority_services.create_authority(authority);
    }
}
