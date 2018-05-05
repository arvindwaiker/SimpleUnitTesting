import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(5,calculator.add(2,3));
        Assert.assertEquals(7,calculator.add(2,5));
        Assert.assertEquals(8,calculator.add(-2,10));
    }

    @Test
    public void testSub() {
        Assert.assertEquals(1,calculator.sub(3,2));
    }
}
