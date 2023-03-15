package com.demo.ecommerce.DTO;

public class UserDTO {
    private Integer id_user;

    private String username;

    private String email;

    private String password;

    private int type_user;

    public UserDTO(int id_user, String username, String email, String password, int type_user) {
        this.id_user = id_user;
        this.username = username;
        this.email = email;
        this.password = password;
        this.type_user = type_user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
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
