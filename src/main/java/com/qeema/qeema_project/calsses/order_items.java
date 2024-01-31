package com.qeema.qeema_project.calsses;

import jakarta.persistence.*;

@Entity
@Table
        (name="order_items")
public class order_items {
    @Id
    @Column
            (name="order_items_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @OneToOne
    @JoinColumn
            (name="id_items")
    private items id_items;
    @OneToOne
    @JoinColumn
            (name="user_customer")
    private user userCustomer;
    @ManyToOne
   @JoinColumn
          (name="id_order")
   private order order;

    public com.qeema.qeema_project.calsses.order getOrder() {
        return order;
    }

    public void setOrder(com.qeema.qeema_project.calsses.order order) {
        this.order = order;
    }

    public order_items() {
    }

    public order_items(items id_items, user userCustomer, order order) {
        this.id_items = id_items;
        this.userCustomer = userCustomer;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public items getId_items() {
        return id_items;
    }

    public void setId_items(items id_items) {
        this.id_items = id_items;
    }

    public user getUserCustomer() {
        return userCustomer;
    }

    public void setUserCustomer(user userCustomer) {
        this.userCustomer = userCustomer;
    }

    @Override
    public String toString() {
        return "order{" +
                "id_items=" + id_items +
                ", username='" + userCustomer + '\'' +

                '}';
    }
}
