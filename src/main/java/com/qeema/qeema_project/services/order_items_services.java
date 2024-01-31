package com.qeema.qeema_project.services;

import com.qeema.qeema_project.Repositoris.Repository_order_items;
import com.qeema.qeema_project.calsses.order;
import com.qeema.qeema_project.calsses.order_items;
import com.qeema.qeema_project.calsses.user;
import com.qeema.qeema_project.exceptions.exception_notfound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class order_items_services {
    final int delivery = 20;
    Repository_order_items repository_order_items;

    @Autowired
    public order_items_services(Repository_order_items repository_order_items) {
        this.repository_order_items = repository_order_items;
    }
    public order_items createOrder_Items (order_items order_items){
        return repository_order_items.save(order_items);
    }
    public order_items editOrder_Items (order_items order_items) throws exception_notfound {
        getorder_itemsById(order_items.getId());
        return repository_order_items.save(order_items);
    }
    public void deletorder_ItemsById ( int id) throws exception_notfound {
        getorder_itemsById(id);
        repository_order_items.deleteById(id);
    }

    public order_items getorder_itemsById (int id) throws exception_notfound {
        Optional<order_items> order_items =repository_order_items.findById(id);
        if (order_items.isPresent()){
            return order_items.get();
        }
        throw new exception_notfound("order_items not found");
    }

    public double gettotalpricebeforedelviery(user user, order order){
        return repository_order_items.gettotalpricebeforedelviery( user, order);
    }
    public double gettotalpriceafterdlviery(user user, order order){
        return repository_order_items.gettotalpricebeforedelviery( user, order)+delivery/repository_order_items.getuser(user,order);
    }


}
