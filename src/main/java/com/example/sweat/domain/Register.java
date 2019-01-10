package com.example.sweat.domain;

import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Controller
public class Register {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public static final String ID_COLUMN = "ID_User";
    public static final String USERNAME_COLUMN = "Name";
    public static final String PASSWORD_COLUMN = "Password";
    public static final String NICKNAME_COLUMN = "NickName";

    private Integer id;
    private String username;
    private String pass;
    private String nickname;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
