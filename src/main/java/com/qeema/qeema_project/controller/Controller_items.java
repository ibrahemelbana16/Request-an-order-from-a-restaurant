package com.qeema.qeema_project.controller;
import com.qeema.qeema_project.calsses.items;
import org.springframework.beans.factory.annotation.Autowired;
import com.qeema.qeema_project.services.items_services;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller_items {
  items_services items_services;

    @Autowired
    public Controller_items(items_services items_services) {
        this.items_services = items_services;
    }
    @PostMapping("/items")
    public items createItem(@RequestBody items item) {

      return items_services.create_Items(item);
    }
}
