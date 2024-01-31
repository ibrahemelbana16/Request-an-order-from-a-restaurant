package com.qeema.qeema_project.calsses;

import jakarta.persistence.*;

@Table
        (name="authorities")
@Entity
public class authority {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id_authority;
    private String authority;
    @ManyToOne
    @JoinColumn(name = "username")
    private user username;

    public user getUsername() {
        return username;
    }

    public void setUsername(user username) {
        this.username = username;
    }

    public authority() {
    }

    public authority(String authority, user username) {
        this.authority = authority;
        this.username = username;
    }

    public int getId_authority() {
        return id_authority;
    }

    public void setId_authority(int id_authority) {
        this.id_authority = id_authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
