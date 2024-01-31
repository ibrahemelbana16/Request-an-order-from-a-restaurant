package com.qeema.qeema_project.Repositoris;

import com.qeema.qeema_project.calsses.order;
import com.qeema.qeema_project.calsses.order_items;
import com.qeema.qeema_project.calsses.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Repository_order_items extends JpaRepository<order_items, Integer> {
@Query
        ("select sum (i.price) from order_items o inner join o.id_items i where o.userCustomer.username = :#{#user.username} and o.order.order_id = :#{#order.order_id}")
    public double gettotalpricebeforedelviery(@Param("user") user user, @Param("order")order order);
    @Query
            ("select count(distinct userCustomer) from order_items o inner join o.id_items i where o.userCustomer.username = :#{#user.username} and o.order.order_id = :#{#order.order_id}")
    public double getuser(@Param("user") user user, @Param("order")order order);


//    List<order_items> findAllByOrderAndUserCustomer(order order, user userCustomer);
}