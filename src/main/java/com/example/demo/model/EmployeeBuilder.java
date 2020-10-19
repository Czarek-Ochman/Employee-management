package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBuilder {

    private Long id = null;
    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String city;
    private String street;
    private String zipCode;
    private Bonus bonus;
    private Section section;

    public EmployeeBuilder(String firstName, String lastName, int age, String country, String city, String street, String zipCode, Bonus bonus, Section section) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.bonus = bonus;
        this.section = section;
    }
}