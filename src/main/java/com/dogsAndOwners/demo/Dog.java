package com.dogsAndOwners.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Dog() {
    }

    public Dog(String name, Integer age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public Integer getAge() {
        return age;
    }
}