package HomeTask4.homeTask4_1;

public abstract class Animals {
    protected String animalType;
    protected String animalFamily;
    protected String animalBread;

    public Animals(String animalType, String animalFamily, String animalBread) {
        this.animalType = animalType;
        this.animalFamily = animalFamily;
        this.animalBread = animalBread;
    }

    public abstract void animalSound();
}
