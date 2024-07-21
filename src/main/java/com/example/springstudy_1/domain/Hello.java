package com.example.springstudy_1.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Hello {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "int")
    private int age;

    @Column(length = 1000)
    private String name;

    public Hello(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
