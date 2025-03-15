package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Athanasios", "Androutsos");
        User user = new User(1, "Costas", "Mask", "cmask", "12345", true);
        Customer customer = new Customer(1, "Andrew", "Dimitrioy", "838948438", "8458985489", "West Attica", "Athens", "Athens", "Patision", "77", "34224");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "Ordered");


        System.out.println("Teacher full name:" + teacher.getFirstname()+ " " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer Vat: " + customer.getVatRegistrtationNo());
        System.out.println("Order timestamp " + order.getFormattedTimestamp());
        System.out.printf("Point: {%d, %d\n", point.getX(), point.getY());

    }
}
