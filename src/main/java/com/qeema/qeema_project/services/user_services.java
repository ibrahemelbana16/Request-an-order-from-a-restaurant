package com.qeema.qeema_project.services;

import com.qeema.qeema_project.Repositoris.Repository_user;
import com.qeema.qeema_project.calsses.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class user_services {
    Repository_user Repository_user;
    @Autowired

    public user_services(com.qeema.qeema_project.Repositoris.Repository_user repository_user) {
        Repository_user = repository_user;
    }

    public user create_user (user user){
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        return Repository_user.save(user);
    }

}
