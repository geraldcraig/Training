import org.junit.Assert;
import org.junit.Test;

public class TddExampleTest {

    @Test
    public void testCarValueToyota() {

        CarCalculator calculateValue = new CarCalculator();

        Assert.assertEquals("base value is $5000", 5000, calculateValue.calculateBrandValue("Toyota"), 0);
    }

    @Test
    public void testCarValueBMW() {

        CarCalculator calculateValue = new CarCalculator();

        Assert.assertEquals("base value is $8000", 8000, calculateValue.calculateBrandValue("BMW"), 0);
    }

    @Test
    public void testCarValueVW() {

        CarCalculator calculateValue = new CarCalculator();

        Assert.assertEquals("base value is $3000", 3000, calculateValue.calculateBrandValue("VW"), 0);
    }

    @Test
    public void testCarValueFord() {

        CarCalculator calculateValue = new CarCalculator();

        Assert.assertEquals("base value is $1000", 1000, calculateValue.calculateBrandValue("Ford"), 0);
    }

}
