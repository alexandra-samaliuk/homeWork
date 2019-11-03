package HomeTask4.homeTask4_2;

public class Cylinder extends ShapeWithRadius {
    double high;

    public Cylinder(double radius, double high) {
        super(radius);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public double volume(double radius, double high){
        double volume;
        volume = 3.14 * radius * radius * high;
        return volume;
    }
}
