import java.io.IOException;

public class AdvancedCalculator extends Calculator {

    YahooCurrencyConverter currencyConverter;

    AdvancedCalculator() {
        currencyConverter = new YahooCurrencyConverter();
    }

    public double sin(double a) {
        return Math.sin(a);
    }

    public double convertCurrency(double input,String srcCurr, String destCurr) {
        try {
            float conversionRate = currencyConverter.getConversionRate(srcCurr,destCurr);
            return input * conversionRate;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
