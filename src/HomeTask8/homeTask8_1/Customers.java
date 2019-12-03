package HomeTask8.homeTask8_1;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Customers extends Thread {
    Semaphore sem;
    static boolean cashbox1 = false;
    static boolean cashbox2 = false;
    static boolean cashbox3 = false;
    int id;
    ArrayList<Product> products;

    Customers(Semaphore sem, int id, ArrayList<Product> products) {
        this.sem = sem;
        this.id = id;
        this.products = products;
    }

    public void run() {
        try {
            sem.acquire();
            if (!cashbox1) {
                cashbox1 = true;
                System.out.println("Покупатель " + id + " занимает кассу 1");
                sleep(500);
                System.out.println("Покупатель " + id + " освобождает кассу 1");
                cashbox1 = false;
            } else if (!cashbox2) {
                cashbox2 = true;
                System.out.println("Покупатель " + id + " занимает кассу 2");
                sleep(500);
                System.out.println("Покупатель " + id + " освобождает кассу 2");
                cashbox2 = false;
            } else if (!cashbox3) {
                cashbox3 = true;
                System.out.println("Покупатель " + id + " занимает кассу 3");
                sleep(500);
                System.out.println("Покупатель " + id + " освобождает кассу 3");
                cashbox3 = false;
            }
            sem.release();
        } catch (InterruptedException e) {
            System.out.println("покупатель ушел");
        }
    }
}
