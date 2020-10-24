package fr.m1iii.rappel.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;

    @Version
    long version;
}
