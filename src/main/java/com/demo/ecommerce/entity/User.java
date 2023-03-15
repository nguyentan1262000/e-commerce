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

    @Column(name = "type_user", nullable = false, length = 10)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private int type_user;

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

    public int getType_user() {
        return type_user;
    }

    public void setType_user(int type_user) {
        this.type_user = type_user;
    }
}