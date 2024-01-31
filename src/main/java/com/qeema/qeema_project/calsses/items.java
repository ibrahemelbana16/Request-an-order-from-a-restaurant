package com.qeema.qeema_project.calsses;

import jakarta.persistence.*;

@Entity
@Table
public class items {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
            (name="id_items")
    private int id_items;
    @Column
            (name="items_name")
    private String items_name;
    @Column
            (name="price")
    private float price;
      @ManyToOne
    @JoinColumn
            (name="id_restaurant")
    private restaurant id_restaurant;

    public items() {
    }

    public items( String items_name, float price, restaurant id_restaurant) {

        this.items_name = items_name;
        this.price = price;
        this.id_restaurant = id_restaurant;
    }

    public int getId_items() {
        return id_items;
    }

    public void setId_items(int id_items) {
        this.id_items = id_items;
    }

    public String getItems_name() {
        return items_name;
    }

    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public restaurant getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(restaurant id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    @Override
    public String toString() {
        return "items{" +
                "id_items=" + id_items +
                ", items_name='" + items_name + '\'' +
                ", price=" + price +
                ", id_restaurant=" + id_restaurant +
                '}';
    }
}
