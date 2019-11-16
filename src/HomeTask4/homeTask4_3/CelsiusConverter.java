package HomeTask4.homeTask4_3;

public class CelsiusConverter implements Converter {
    @Override
    public double convert(double degree, boolean type) {
        double result;
        if (type) {
            result = (degree - 32) * 5 / 9;
            return result;
        } else {
            result = degree - 273.15;
            return result;
        }
    }
}
