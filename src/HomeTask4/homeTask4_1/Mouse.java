package HomeTask4.homeTask4_1;

public class Mouse extends Animals implements AnimalMovement, CanBeEaten {
    public Mouse(String animalType, String animalFamily, String animalBread) {
        super(animalType, animalFamily, animalBread);
    }

    @Override
    public void animalSound() {
        System.out.println("Sound for mouse - pi");
    }

    @Override
    public void animalMovements() {
        System.out.println("Mouse can move");
    }

    @Override
    public void canBeEaten() {
        System.out.println("Mouse can be eaten by somebody");
    }
}
