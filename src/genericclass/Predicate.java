package genericclass;
/**
 *
 * @author Greg Williamson
 * @version 0.1
 *
 * @param <T> type
 */
public interface Predicate<T> {

    /**
    * Boolean Test.
    * @param value value passed
    * @return true
    */
    boolean invoke(T value);
}
