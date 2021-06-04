package com.company;

public class App {
    public static void main(String[] args) {

        Address billingAddress = new Address("127 3rd Street","", "Cheney", "WA", "99004");
        Address shippingAddress = new Address("100 5th Street","", "Cheney", "WA", "99004");
        Customer customer = new Customer("Merc", "Spring", "e@e.e", "111-555-999", true, shippingAddress, billingAddress);

        System.out.println(customer.getBillingAddress().getStreetOne());
        System.out.println(customer.getShippingAddress().getStreetOne());
        customer.getShippingAddress().setStreetOne("121 7th Street");
        System.out.println(customer.getShippingAddress());
        System.out.println(customer);
    }
}
