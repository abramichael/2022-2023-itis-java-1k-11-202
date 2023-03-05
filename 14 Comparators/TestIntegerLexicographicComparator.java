import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class TestIntegerLexicographicComparator {

    @Test
    public void numDigitsIsWorkingCorrect() {
        Assert.assertArrayEquals(new int []{3, 100},
                IntegerLexicographicComparator.getNumberOfDigits(100));
        Assert.assertArrayEquals(new int []{4, 1000},
                IntegerLexicographicComparator.getNumberOfDigits(1000));
        Assert.assertArrayEquals(new int []{1, 1},
                IntegerLexicographicComparator.getNumberOfDigits(0));
        Assert.assertArrayEquals(new int []{1, 1},
                IntegerLexicographicComparator.getNumberOfDigits(1));
        Assert.assertArrayEquals(new int []{2, 10},
                IntegerLexicographicComparator.getNumberOfDigits(50));
        Assert.assertArrayEquals(new int []{3, 100},
                IntegerLexicographicComparator.getNumberOfDigits(999));
    }

    @Test
    public void lexicComparatorWorkingCorrect() {
        Comparator<Integer> c = new IntegerLexicographicComparator();
        Assert.assertTrue(c.compare(10, 2) < 0);
        Assert.assertTrue(c.compare(100, 2) < 0);
        Assert.assertTrue(c.compare(105, 20) < 0);
        Assert.assertTrue(c.compare(30, 20) > 0);
        Assert.assertTrue(c.compare(205, 20) > 0);
        Assert.assertTrue(c.compare(20, 20) == 0);

    }

}
