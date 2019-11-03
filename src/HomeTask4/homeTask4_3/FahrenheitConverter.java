package HomeTask4.homeTask4_3;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double degree, boolean type) {
        double result;
        if (type) {
            result = (degree * 9 / 5) + 32;
            return result;
        } else {
            result = (degree - 273.15) * 9 / 5 + 32;
            return result;
        }
    }
}
