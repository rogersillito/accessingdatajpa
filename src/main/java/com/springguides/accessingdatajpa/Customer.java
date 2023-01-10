package com.springguides.accessingdatajpa;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO) // this worked with H2
    @SequenceGenerator(name = "customer_id_seq",
            sequenceName = "customer_id_seq",
            allocationSize = 1)
    @GeneratedValue(generator = "customer_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(updatable = false)
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
