package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @Enumerated(EnumType.STRING)
    private Bonus bonus;
    @Enumerated(EnumType.STRING)
    private Section section;

    public Employee(Person person, Bonus bonus, Section section) {
        this.person = person;
        this.bonus = bonus;
        this.section = section;
    }
}