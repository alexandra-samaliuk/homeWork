package HomeTask4.homeTask4_1;

public class HomeTask4_1 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("всеядное", "семейство мышиных", "мышь полевая");
        Cat cat = new Cat("плотоядное", "семейство кошачих", "тигр");
        Dog dog = new Dog("плотоядное", "семейство собачьих", "лабродор");
        mouse.animalSound();
        mouse.eatable();
        mouse.animalMovements();
        cat.animalSound();
        cat.eatable();
        cat.animalMovements();
        dog.animalSound();
        dog.eatable();
        dog.animalMovements();
    }
}
