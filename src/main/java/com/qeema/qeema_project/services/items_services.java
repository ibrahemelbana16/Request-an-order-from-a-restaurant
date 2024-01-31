package com.qeema.qeema_project.services;

import com.qeema.qeema_project.Repositoris.Repository_items;
import com.qeema.qeema_project.calsses.items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class items_services {
    Repository_items repository_items;
    @Autowired

    public items_services(Repository_items repository_items) {
        this.repository_items = repository_items;
    }
    public items create_Items (items items){
        return repository_items.save(items);
    }
}
