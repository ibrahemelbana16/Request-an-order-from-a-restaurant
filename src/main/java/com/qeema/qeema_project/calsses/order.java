package com.qeema.qeema_project.calsses;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table
        (name="order_table")
public class order {
    @Id
    @Column
            (name="order_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @ManyToOne
    @JoinColumn
            (name="user_col")
       private user user_col;

    @ManyToOne
    @JoinColumn
            (name="id_restaurant")
    private restaurant id_restaurant;
    @Column
            (name="deadline")
    private Time deadline;

    public order() {
    }

    public order(user user_col, restaurant id_restaurant, Time deadline) {
        this.user_col = user_col;
        this.id_restaurant = id_restaurant;
        this.deadline = deadline;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public user getUser_col() {
        return user_col;
    }

    public void setUser_col(user user_col) {
        this.user_col = user_col;
    }

    public restaurant getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(restaurant id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public Time getDeadline() {
        return deadline;
    }

    public void setDeadline(Time deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "order{" +
                "order_id=" + order_id +
                ", user_col='" + user_col + '\'' +
//                ", id_restaurant=" + id_restaurant +
                ", deadline=" + deadline +
                '}';
    }
}
