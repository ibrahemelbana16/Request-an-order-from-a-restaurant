package com.qeema.qeema_project.services;
import com.qeema.qeema_project.Repositoris.Repository_order;
import com.qeema.qeema_project.calsses.order;
import com.qeema.qeema_project.exceptions.exception_notfound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class order_services {
    Repository_order repository_order;
    @Autowired
    public order_services(Repository_order repository_order) {
        this.repository_order = repository_order;
    }
    public order createOrder (order order){
        return repository_order.save(order);
    }
    public void deletorderById ( int id) throws exception_notfound {
        getorderById(id);
        repository_order.deleteById(id);
    }
    public order getorderById (int id) throws exception_notfound {
       Optional<order> order =repository_order.findById(id);
       if (order.isPresent()){
           return order.get();
       }
       throw new exception_notfound("order not found");
    }


}
