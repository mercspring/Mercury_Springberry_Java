package com.company;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean rewardsMember;
    public Address ShippingAddress;
    public Address BillingAddress;


    public Customer(String firstName, String lastName, String email, String phoneNumber, boolean rewardsMember, Address shippingAddress, Address billingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.rewardsMember = rewardsMember;
        ShippingAddress = shippingAddress;
        BillingAddress = billingAddress;
    }
    public Customer(String firstName, String lastName, String email, String phoneNumber, boolean rewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.rewardsMember = rewardsMember;
        this.ShippingAddress = new Address();
        this.BillingAddress = new Address();
    }
    public Customer(){

    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public Address getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        ShippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        BillingAddress = billingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(ShippingAddress, customer.ShippingAddress) && Objects.equals(BillingAddress, customer.BillingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, ShippingAddress, BillingAddress);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ShippingAddress=" + ShippingAddress +
                ", BillingAddress=" + BillingAddress +
                '}';
    }
}
