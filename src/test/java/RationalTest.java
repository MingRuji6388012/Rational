import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd_1() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testAdd_2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 5;
        y.denominator = 7;
        x.add(y);
        Assert.assertEquals(5, x.numerator);
    }
    @Test
    public void testAdd_3() {
        Rational x = new Rational();
        x.numerator = -5;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = -3;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testAdd_4() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 1;
        x.add(y);
        Assert.assertEquals(5, x.numerator);
    }
    @Test
    public void testSubtract_1() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testSubtract_2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
    }
    @Test
    public void testSubtract_3() {
        Rational x = new Rational();
        x.numerator = -3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = -1;
        y.denominator = 2;
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
    }
    @Test
    public void testSubtract_4() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 2;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testMultiply_1() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testMultiply_2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(0, x.numerator);
    }
    @Test
    public void testMultiply_3() {
        Rational x = new Rational();
        x.numerator = -3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = -1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testMultiply_4() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(0, x.numerator);
    }
    @Test
    public void testDivide_1() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
    }
    @Test
    public void testDivide_2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(0, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }
    @Test
    public void testDivide_3() {
        Rational x = new Rational();
        x.numerator = -3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(-6, x.numerator);
    }
    @Test
    public void testEquals_1() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertTrue(x.equals(y));
    }
    @Test
    public void testEquals_2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertFalse(x.equals(y));
    }
    @Test
    public void testEquals_3() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertFalse(x.equals(y));
    }
    @Test
    public void testEquals_4() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Assert.assertFalse(x.equals(null));
    }

    @Test
    public void testCompareTo_1(){
        Rational x = new Rational();
        x.numerator =1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;
        Assert.assertEquals(-1, x.compareTo(y));
    }
    @Test
    public void testCompareTo_2(){
        Rational x = new Rational();
        x.numerator =1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertEquals(0, x.compareTo(y));
    }
    @Test
    public void testCompareTo_3(){
        Rational x = new Rational();
        x.numerator =0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;
        Assert.assertEquals(-1, x.compareTo(y));
    }
    @Test
    public void testCompareTo_4(){
        Rational x = new Rational();
        x.numerator =3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 2;
        Assert.assertEquals(1, x.compareTo(y));
    }
    @Test
    public void testToString_1() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 10;
        Assert.assertEquals("1/5", x.toString());
    }

    @Test
    public void testToString_4() {
        Rational x = new Rational();
        x.numerator = 4;
        x.denominator = 2;
        Assert.assertEquals("2", x.toString());
    }
    @Test
    public void testToString_5() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Assert.assertEquals("0", x.toString());
    }
    @Test
    public void testToString_6() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 0;
        Assert.assertEquals("Invalid Rational", x.toString());
    }
    @Test
    public void testToString_7() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 0;
        Assert.assertEquals("Invalid Rational", x.toString());
    }
    @Test
    public void testToString_8() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = -5;
        Assert.assertEquals("-2/5", x.toString());
    }
    @Test
    public void testToString_9() {
        Rational x = new Rational();
        x.numerator = -1;
        x.denominator = -2;
        Assert.assertEquals("1/2", x.toString());
    }
    @Test
    public void testToString_10() {
        Rational x = new Rational();
        x.numerator = -5;
        x.denominator = 1;
        Assert.assertEquals("-5", x.toString());
    }
    @Test
    public void testToString_11() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = -1;
        Assert.assertEquals("-5", x.toString());
    }
}