package rocks.zipcode.io.stringparser;

import org.junit.Test;
import rocks.zipcode.io.StringParser;
import rocks.zipcode.io.TestUtils;

/**
 * @author leon on 10/01/2019.
 */
public class ParseCharactersTest {
    @Test
    public void test1() {

        test("123", new Character[]{'1','2','3'});
    }

    @Test
    public void test2() {

        test(" 23", new Character[]{' ', '2','3'});
    }

    @Test
    public void test3() {

        test("   ", new Character[]{' ', ' ', ' '});
    }

    @Test
    public void test4() {

        test(null, null);
    }

    private void test(String input, Character[] expected) {

        Character[] actual = StringParser.parseCharacters(input);

        TestUtils.assertArrayEquals(expected, actual);
    }
}
