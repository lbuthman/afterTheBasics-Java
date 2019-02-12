import com.afterthebasics.main.exercise01.SpecializedCalculator;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class SpecializedCalculatorTest {

    @org.junit.Test
    public void test_AdditivePersistence() {
        //GIVEN
        int number = 9876;
        int radix = 4;

        //WHEN
        int actual = SpecializedCalculator.additivePersistence(BigInteger.valueOf(number), radix);

        //THEN
        int expected = 2;
        assertEquals(expected, actual);
    }
}