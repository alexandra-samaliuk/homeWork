package HomeTask4.homeTask4_1;

public class Cat extends Animals implements AnimalMovement, Eatable {
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
    public void eatable() {
        System.out.println("Cat can be eaten by somebody");
        System.out.println("Cat can eat mouse");
    }
}
