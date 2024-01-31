package com.qeema.qeema_project.controller;
import com.qeema.qeema_project.calsses.order;
import com.qeema.qeema_project.exceptions.exception_notfound;
import com.qeema.qeema_project.services.order_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controller_order {
    order_services order_services;
    @Autowired
    public controller_order(order_services order_services) {
        this.order_services = order_services;
    }
    @PostMapping("/order")
    public order createorder(@RequestBody order order) {

        return order_services.createOrder(order);
    }
    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable int id) throws  exception_notfound {
        order_services.deletorderById( id);
    }
    @GetMapping("/orders/{id}")
    public order getorderById(@PathVariable int id)throws  exception_notfound{
        return order_services.getorderById(id);
    }

}

