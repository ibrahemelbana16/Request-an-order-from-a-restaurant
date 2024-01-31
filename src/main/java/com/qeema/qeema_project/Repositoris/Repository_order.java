package com.qeema.qeema_project.Repositoris;

import com.qeema.qeema_project.calsses.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_order extends JpaRepository<order, Integer> {



}