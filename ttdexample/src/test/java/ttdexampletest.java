import org.junit.Assert;
import org.junit.Test;

public class ttdexampletest {

    @Test
    public void testCarValueToyota() {
        CarCalculator calculateValue = new CarCalculator();

        Assert.assertEquals("base value is $5000", 5000, calculateValue.calculateBrandValue("Toyota"), 0);
    }
}
