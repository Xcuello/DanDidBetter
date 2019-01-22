package rocks.zipcode.io.stringparser;

import org.junit.Test;
import rocks.zipcode.io.StringParser;
import rocks.zipcode.io.TestUtils;

/**
 * @author leon on 10/01/2019.
 */
public class ParseIntegersTest {
    @Test
    public void test0() {

        test("789", new Integer[]{7,8,9});
    }

    @Test
    public void test1() {

        test("123", new Integer[]{1,2,3});
    }

    @Test
    public void test2() {

        test(" 23", new Integer[]{2,3});
    }

    @Test
    public void test3() {

        test("   ", new Integer[]{});
    }

    @Test
    public void test4() {

        test(null, null);
    }

    private void test(String input, Integer[] expected) {
        Integer[] actual = StringParser.parseIntegers(input);
        TestUtils.assertArrayEquals(expected, actual);
    }
}
