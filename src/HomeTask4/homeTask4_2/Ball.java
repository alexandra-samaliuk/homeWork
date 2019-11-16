package HomeTask4.homeTask4_2;

public class Ball extends ShapeWithRadius {
    public Ball(double radius) {
        super(radius);
    }

    public double volume(double radius) {
        double volume;
        volume = 4.00 / 3.00 * radius * radius * radius * 3.14;
        return volume;
    }
}
