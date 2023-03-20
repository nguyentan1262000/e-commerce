package com.demo.ecommerce.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id_user;

    @Column(name = "username")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String username;

    @Column(name = "email")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String email;

    @Column(name = "password")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String password;

    @Enumerated
    @Column(name = "role")
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}