package com.qeema.qeema_project.services;
import com.qeema.qeema_project.Repositoris.Repository_authority;

import com.qeema.qeema_project.calsses.authority;
import com.qeema.qeema_project.calsses.order_items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class authority_services {
    Repository_authority Repository_authority;
    @Autowired

    public authority_services(Repository_authority repository_authority) {
        Repository_authority = repository_authority;
    }
    public authority create_authority (authority authority){
        return Repository_authority.save(authority);
    }
}
