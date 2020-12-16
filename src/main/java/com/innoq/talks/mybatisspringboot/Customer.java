package com.innoq.talks.mybatisspringboot;

public final class Customer {

    private Long id;
    private final String firstName;
    private final String lastName;
    private final Address address;

    public Customer(final String firstName, final String lastName, final Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    private Customer(Long id, String firstName, String lastName, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
