package com.qeema.qeema_project.Repositoris;

import com.qeema.qeema_project.calsses.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_user extends JpaRepository<user, String> {



}



