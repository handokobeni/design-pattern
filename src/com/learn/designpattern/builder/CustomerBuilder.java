package com.learn.designpattern.builder;

public class CustomerBuilder {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    public CustomerBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public CustomerBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Customer build() {
        return new Customer(
            this.id,
            this.firstname,
            this.lastname,
            this.email,
            this.phone
        );
    }
}
