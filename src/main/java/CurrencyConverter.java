import java.io.IOException;

public interface CurrencyConverter {
    double getConversionRate(String from, String to) throws IOException;
}
