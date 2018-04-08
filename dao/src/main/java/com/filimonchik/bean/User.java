package com.filimonchik.bean;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Entity - User
 */
@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
//        (exclude = "adverts")

@ToString(exclude = "adverts")

public class User implements Serializable {
    public static final String LOGIN_REGEX = "[a-zA-Zа-яА-Я0-9_.-]+";
    public static final String PASSWORD_REGEX = "[a-zA-Zа-яА-Я0-9_.-]{6,}";
    public static final String EMAIL_REGEX = "[a-zA-Z0-9_.-]+[@][a-zA-Z_.-]+[.][a-zA-Z]+";

    private static final long serialVersionUID = 1L;

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String email;

    @OneToMany(mappedBy = "user")
    List<Advert> adverts;
//            = new List<>();


    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}