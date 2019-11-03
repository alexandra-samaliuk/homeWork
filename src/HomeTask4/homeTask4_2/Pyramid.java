package HomeTask4.homeTask4_2;

public class Pyramid extends Shape {
    double square;
    double height;

    public Pyramid(double square, double height) {
        this.square = square;
        this.height = height;
    }

    public double getSquare() {
        return square;
    }

    public double getHeight() {
        return height;
    }

    public double volume(double square, double high) {
        double volume;
        volume = 1.00 / 3.00 * square * high;
        return volume;
    }
}
