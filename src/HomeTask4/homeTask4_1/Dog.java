package HomeTask4.homeTask4_1;

public class Dog extends Animals implements AnimalMovement, Eatable {
    public Dog(String animalType, String animalFamily, String animalBread) {
        super(animalType, animalFamily, animalBread);
    }

    @Override
    public void animalSound() {
        System.out.println("Sound for dog - woof");
    }

    @Override
    public void animalMovements() {
        System.out.println("Dog can move");
    }

    @Override
    public void eatable() {
        System.out.println("Dog can eat somebody");
    }
}
