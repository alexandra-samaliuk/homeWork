package HomeTask8.homeTask8_1;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class HomeTask8_1 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("milk", 2.5));
        products.add(new Product("water", 0.5));
        products.add(new Product("chicken", 8.5));
        products.add(new Product("apple", 1.8));

        for (int i = 1; i<8; i++)
            new Customers(sem,i, products).start();
    }
}
