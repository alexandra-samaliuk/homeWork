package HomeTask6.homeTask6_2;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class HomeTask6_2 {
    public static void main(String[] args) {
        ArrayList<Product> productsCustomer1 = new ArrayList<>();
        productsCustomer1.add(new Product("milk", 2.5));
        productsCustomer1.add(new Product("water", 0.5));
        Customer customer1 = new Customer(productsCustomer1);

        ArrayList<Product> productsCustomer2 = new ArrayList<>();
        productsCustomer2.add(new Product("milk", 2.5));
        productsCustomer2.add(new Product("chicken", 8.5));
        Customer customer2 = new Customer(productsCustomer2);

        ArrayList<Product> productsCustomer3 = new ArrayList<>();
        productsCustomer3.add(new Product("water", 0.5));
        productsCustomer3.add(new Product("apple", 1.8));
        Customer customer3 = new Customer(productsCustomer3);

        ArrayDeque<Customer> queue = new ArrayDeque<>();
        queue.add(customer1);
        queue.add(customer2);
        queue.add(customer3);

        while (queue.peek()!=null){
            System.out.println(queue.pop());
        }

    }

}
