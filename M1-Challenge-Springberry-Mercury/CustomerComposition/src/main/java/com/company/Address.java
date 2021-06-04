package com.company;

import java.util.Objects;

public class Address {
    private String streetOne;
    private String streetTwo;
    private String city;
    private String state;
    private String zip;

    Address(String streetOne, String streetTwo, String city, String state, String zip) {
        this.streetOne = streetOne;
        this.streetTwo = streetTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    Address(){

    }

    public String getStreetOne() {
        return streetOne;
    }

    public void setStreetOne(String streetOne) {
        this.streetOne = streetOne;
    }

    public String getStreetTwo() {
        return streetTwo;
    }

    public void setStreetTwo(String streetTwo) {
        this.streetTwo = streetTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetOne, address.streetOne) && Objects.equals(streetTwo, address.streetTwo) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zip, address.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetOne, streetTwo, city, state, zip);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetOne='" + streetOne + '\'' +
                ", streetTwo='" + streetTwo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
