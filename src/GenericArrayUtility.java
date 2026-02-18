import java.util.Arrays;

/**
 * Utility class for merging two arrays of the same type.
 *
 * This method can be used in real-world scenarios like:
 * - Combining data from multiple sources
 * - Merging results from APIs
 * - Data processing tasks
 */
public class GenericArrayUtility {

    public static <T> T[] mergeArrays(T[] firstArray, T[] secondArray) {

        // BONUS: Handle null cases
        if (firstArray == null && secondArray == null) {
            return (T[]) new Object[0];
        }

        if (firstArray == null) {
            return secondArray;
        }

        if (secondArray == null) {
            return firstArray;
        }

        // Create new array with combined length
        T[] mergedArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);

        // Copy elements of second array into merged array
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);

        return mergedArray;
    }
}
