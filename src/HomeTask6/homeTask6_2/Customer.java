package HomeTask6.homeTask6_2;

import java.util.ArrayList;

public class Customer {
    private int id;
    private static int counter;
    ArrayList<Product> products;
    static{
        counter = 1;
    }
    public Customer(ArrayList<Product> products) {
        this.products = products;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
