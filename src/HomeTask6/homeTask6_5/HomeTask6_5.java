package HomeTask6.homeTask6_5;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask6_5 {
    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        int option;
        int index;
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(new Car("KIA", "CEED", 18251.25));
        carsList.add(new Car("RENAULT", "STEPWAY", 12550.10));
        carsList.add(new Car("BMW", "X5", 21350.45));
        carsList.add(new Car("VOLVO", "XC90", 31420.18));
        while (check) {
            System.out.println("Выберете одну из опций:\n 1 - добавить машину\n 2 - получить информацию по машине\n 3 - купить машину\n 4 - вывести список машин\n 5 - завершить работу");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    Car add = addCar();
                    if(add.getPrice() > 0){
                        carsList.add(add);
                    } else {
                        System.out.println("Цена введена неверно");
                    }
                    break;
                case 2:
                    index = infoCar(carsList);
                    if (index <= carsList.size()) {
                        System.out.println(carsList.get(index - 1));
                    } else {
                        System.out.println("Номер введен неверно");
                    }
                    break;
                case 3:
                    index = removeCar(carsList);
                    if (index <= carsList.size()) {
                        carsList.remove(index - 1);
                    } else {
                        System.out.println("Номер введен неверно");
                    }
                    break;
                case 4:
                    for (Car c : carsList) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.out.println("Такой опции нет");
            }
        }
    }

    public static Car addCar() {
        Scanner scanner = new Scanner(System.in);
        double price;
        System.out.println("Введите марку машины");
        String brand = scanner.nextLine();
        System.out.println("Введите модель машины");
        String model = scanner.nextLine();
        System.out.println("Введите цену машины");
        if (scanner.hasNextDouble()) {
            price = scanner.nextDouble();
        } else {
            price = -1;
        }
        Car car = new Car(brand, model, price);
        return car;
    }

    public static int removeCar(ArrayList<Car> cars) {
        int index = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер машины для покупки");
        for (Car c : cars) {
            System.out.println(index + " - " + c);
            index++;
        }
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else {
            index = cars.size() + 1;
        }
        return index;
    }

    public static int infoCar(ArrayList<Car> cars) {
        int index = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер машины по которой хотите получить информацию");
        for (Car c : cars) {
            System.out.println(index + " - " + c.getBrand());
            index++;
        }
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else {
            index = cars.size() + 1;
        }
        return index;
    }
}
