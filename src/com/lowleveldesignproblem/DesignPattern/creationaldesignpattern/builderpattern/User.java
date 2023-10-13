package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.builderpattern;
// // Entity Class  used to construct the DTO
public class User {
    String firstName;

    String lastName;
    Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
