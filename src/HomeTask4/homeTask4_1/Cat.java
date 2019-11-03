package HomeTask4.homeTask4_1;

public class Cat extends Animals implements AnimalMovement, CanEat, CanBeEaten {
    public Cat(String animalType, String animalFamily, String animalBread) {
        super(animalType, animalFamily, animalBread);
    }

    @Override
    public void animalSound() {
        System.out.println("Sound for cat - meow");
    }

    @Override
    public void animalMovements() {
        System.out.println("Cat can move");
    }

    @Override
    public void canBeEaten() {
        System.out.println("Cat can be eaten by somebody");
    }

    @Override
    public void canEat() {
        System.out.println("Cat can eat mouse");
    }
}
