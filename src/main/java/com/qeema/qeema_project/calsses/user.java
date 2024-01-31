package com.qeema.qeema_project.calsses;

import jakarta.persistence.*;

@Entity
@Table
        (
                name = "users"
        )
public class user {
    @Id
    @Column
            (name="username")
    private String username;
    @Column
            (name="password")
    private String password;
    @Column
            (name="enabled")
    private Boolean enabled;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public user() {
    }

    public user(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                '}';
    }
}
