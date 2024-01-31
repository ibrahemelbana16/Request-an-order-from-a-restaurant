package com.qeema.qeema_project.controller;

import com.qeema.qeema_project.calsses.order;
import com.qeema.qeema_project.calsses.order_items;
import com.qeema.qeema_project.calsses.user;
import com.qeema.qeema_project.exceptions.exception_notfound;
import com.qeema.qeema_project.services.order_items_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class controller_order_items {
    order_items_services order_items_services;
    @Autowired

    public controller_order_items(order_items_services order_items_services) {
        this.order_items_services = order_items_services;
    }

    @GetMapping("/orderitems/{id}")
    public order_items getOrderItems(@PathVariable int id) throws exception_notfound {

        return order_items_services.getorder_itemsById(id);
    }
    @PostMapping("/orderitems")
    public order_items order_items_services(@RequestBody order_items order_items) {

        return order_items_services.createOrder_Items(order_items);
    }
   @PutMapping("/ordersitmesupdate")
    public order_items updateOrder(@RequestBody order_items order_items) throws exception_notfound {
       return order_items_services.editOrder_Items(order_items);
    }
    @DeleteMapping("/ordersitmes/{id}")
    public void deletorder_ItemsById(@PathVariable int id) throws  exception_notfound {
        order_items_services.deletorder_ItemsById( id);
    }
    @GetMapping("/ordersitems/{user}/{order}")
    public double gettotalpricebeforedelviery(@PathVariable user user, order order)throws  exception_notfound{
        return order_items_services.gettotalpricebeforedelviery(user, order);
    }
}
