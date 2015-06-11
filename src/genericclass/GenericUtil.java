package genericclass;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Greg Williamson
 * @version 0.1
 *
 */

public class GenericUtil {

    /**
     * Finds all values in an array that fulfill a given predicate.
     *
     * @param values an array of values
     * @param pred a predicate
     * @param <T> type
     * @return a list of values that match the predicate
     */
    public static <T> List<T> findAllMatches(T[] values,
            Predicate<T> pred) {

        List<T> list = new ArrayList<T>();

        for (int i = 0; i < values.length; ++i) {
            if (pred.invoke(values[i])) {
                list.add(values[i]);
            }
        }

        return list;
    }
}
