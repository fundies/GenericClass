package genericclass;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

/**
 *
 */

/**
 * @author Greg Williamson
 * @version 0.1
 *
 */
public class GenericUtilTest {

    /**
     * Test 2.
     */
    @Test
    public void testEven() {

        /**
         * Utility Classes should only have private constructors that do
         * nothing. However, you can't access a private method in juint.
         * So this is required to pass the coverage test...
         * tl;dr webcat sux
         */
        new GenericUtil();

        System.out.println("Test Even");

        Predicate<Integer> isEven = new Predicate<Integer>() {
            public boolean invoke(Integer value) {
                return value % 2 == 0;
            }
        };
        Integer[] values = { 1, 4, 9, 16, 25, 36, 49 };
        List<Integer> matches = GenericUtil.findAllMatches(values, isEven);
        assertEquals(matches.toString(), "[4, 16, 36]");
    }

    /**
     * Test 2.
     */
    @Test
    public void testShort() {
        System.out.println("Test Short");

        Predicate<String> isShort = new Predicate<String>() {
            public boolean invoke(String value) {
                return value.length() <= 3;
            }
        };

        String[] values = { "Mary", "had", "a", "little", "lamb" };
        List<String> matches = GenericUtil.findAllMatches(values, isShort);
        assertEquals(matches.toString(), "[had, a]");
    }

}
