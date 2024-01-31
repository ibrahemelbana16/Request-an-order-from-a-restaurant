package com.qeema.qeema_project.services;

import com.qeema.qeema_project.Repositoris.Repository_restaurant;
import com.qeema.qeema_project.calsses.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class restaurnt_servicses {
    Repository_restaurant repository_restaurant;
    @Autowired

    public restaurnt_servicses(Repository_restaurant repository_restaurant) {
        this.repository_restaurant = repository_restaurant;
    }
    public restaurant create_Restaurant (restaurant restaurnt){
        return repository_restaurant.save(restaurnt);
    }
}
