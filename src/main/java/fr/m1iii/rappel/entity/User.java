package fr.m1iii.rappel.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_user") // Pour préciser que c'est une table de base de donnée
@Data // Pour Lombok : génére des getter setter + constructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany
    private List<Articles> article;

    @Version
    private int version;

    public User() {}

    public User(String name) {
        this.name = name;
    }
}
