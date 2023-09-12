import org.junit.Assert;
import org.junit.Test;
public class RationalTest {
    @Test
    public void testAdd() throws Rational.Illegal {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Rational d = new Rational(1,3);
        Assert.assertEquals(3, x.numerator);
    }
}
