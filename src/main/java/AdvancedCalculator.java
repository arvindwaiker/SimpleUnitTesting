import java.io.IOException;

public class AdvancedCalculator extends Calculator {

    CurrencyConverter currencyConverter;

    public CurrencyConverter getCurrencyConverter() {
        return currencyConverter;
    }

    public void setCurrencyConverter(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public double sin(double a) {
        return Math.sin(a);
    }

    public double convertCurrency(double input,String srcCurr, String destCurr) {
        try {
            double conversionRate = currencyConverter.getConversionRate(srcCurr,destCurr);
            return input * conversionRate;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
