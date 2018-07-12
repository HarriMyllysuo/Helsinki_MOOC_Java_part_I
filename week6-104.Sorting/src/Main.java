
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, 1, 11, 2, 3, 4};
        System.out.println(Arrays.toString(values));
        sort(values);

        /* System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

        System.out.println(Arrays.toString(values));
        
        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
        
        swap(values, 0, 3);
        System.out.println(Arrays.toString(values)); */
    }

    public static int smallest(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexFinal = 0;
        int minValue = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
                indexFinal = i;
            }
        }
        return indexFinal;
    }

    public static void swap(int[] array, int index1, int index2) {
        int i;
        int j;
        i = array[index2];
        j = array[index1];

        array[index1] = i;
        array[index2] = j;
    }

    public static void sort(int[] array) {

        int i = 0;
        while (i < array.length) {
            int indexOfSmall = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexOfSmall);
            System.out.println(Arrays.toString(array));
            i++;
        }
    }
}
