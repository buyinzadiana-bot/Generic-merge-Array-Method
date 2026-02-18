import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // -------- INTEGER EXAMPLE --------
        Integer[] firstNumbers = {1, 2, 3};
        Integer[] secondNumbers = {4, 5, 6};

        Integer[] mergedNumbers =
                GenericArrayUtility.mergeArrays(firstNumbers, secondNumbers);

        System.out.println("Merged Integer Array: "
                + Arrays.toString(mergedNumbers));


        // -------- STRING EXAMPLE --------
        String[] firstFruits = {"apple", "banana"};
        String[] secondFruits = {"cherry", "date"};

        String[] mergedFruits =
                GenericArrayUtility.mergeArrays(firstFruits, secondFruits);

        System.out.println("Merged String Array: "
                + Arrays.toString(mergedFruits));
    }
}
