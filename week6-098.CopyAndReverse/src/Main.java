
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        copied[0] = 99;

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        System.out.println("");

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int length = array.length;
        int[] copied = new int[length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int length = array.length;
        int[] copied = new int[length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[length-1-i];
        }
        /* int i = 0, j = length - 1;
        while (i < length) {
            copied[j] = array[i];
            i++;
            j--;
        } */
        return copied;
    }
}
