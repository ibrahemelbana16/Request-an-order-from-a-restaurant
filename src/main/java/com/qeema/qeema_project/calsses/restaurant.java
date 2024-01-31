package com.qeema.qeema_project.calsses;

import jakarta.persistence.*;

@Entity
@Table
public class restaurant {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
            (name="id_restaurant")
    private int id_restaurant;
    @Column
            (name="restaurant_name")
    private String restaurant_name;

    public restaurant() {
    }

    public restaurant( String restaurant_name) {

        this.restaurant_name = restaurant_name;
    }

    public int getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(int id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    @Override
    public String toString() {
        return "restaurant{" +
                "id_restaurant=" + id_restaurant +
                ", restaurant_name='" + restaurant_name + '\'' +
                '}';
    }
}
