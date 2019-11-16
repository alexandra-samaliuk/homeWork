package HomeTask4.homeTask4_1;

public class HomeTask4_1 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("всеядное", "семейство мышиных", "мышь полевая");
        Cat cat = new Cat("плотоядное", "семейство кошачих", "тигр");
        Dog dog = new Dog("плотоядное", "семейство собачьих", "лабродор");
        mouse.animalSound();
        mouse.canBeEaten();
        mouse.animalMovements();
        cat.animalSound();
        cat.canEat();
        cat.canBeEaten();
        cat.animalMovements();
        dog.animalSound();
        dog.canEat();
        dog.animalMovements();
    }
}
