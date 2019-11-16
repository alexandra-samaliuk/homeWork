package HomeTask4.homeTask4_3;

public class HomeTask4_3 {
    public static void main(String[] args) {
        double degree = 32;
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double c_to_f = fahrenheitConverter.convert(degree, true);
        double k_to_f = fahrenheitConverter.convert(degree, false);
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        double f_to_c = celsiusConverter.convert(degree, true);
        double k_to_c = celsiusConverter.convert(degree, false);
        KelvinConverter kelvinConverter = new KelvinConverter();
        double f_to_k = kelvinConverter.convert(degree, true);
        double c_to_k = kelvinConverter.convert(degree, false);
        System.out.printf("%f в цельсиях = %f в фарингейтах\n", degree, c_to_f);
        System.out.printf("%f в кельвинах = %f в фарингейтах\n", degree, k_to_f);
        System.out.printf("%f в фарингейтах = %f в цельсиях\n", degree, f_to_c);
        System.out.printf("%f в кельвинах = %f в цельсиях\n", degree, k_to_c);
        System.out.printf("%f в фарингейтах = %f в кельвинах\n", degree, f_to_k);
        System.out.printf("%f в цельсиях = %f в кельвинах\n", degree, c_to_k);

    }
}

