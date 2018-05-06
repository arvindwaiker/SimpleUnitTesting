import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AdvancedCalculatorTest {

    @Mock
    YahooCurrencyConverter converter;

    @InjectMocks
    @Spy
    AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void testSinWhen90() {
        Assert.assertEquals(1.0,calculator.sin(1.5708),0.001);
    }

    @Test
    public void testCurrencyConversion() throws IOException {
        when(converter.getConversionRate("INR","USD")).thenReturn((double) 1/70);
        Assert.assertEquals(1,calculator.convertCurrency(70,"INR","USD"),0.0);
    }

}
