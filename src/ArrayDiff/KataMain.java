package ArrayDiff;

import java.util.Arrays;

import static ArrayDiff.Kata.arrayDiff;

public class KataMain {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        int[] b = {2, 4};

        int[] diff = arrayDiff(a, b);

        System.out.println("Array 'a': " + Arrays.toString(a));
        System.out.println("Array 'b': " + Arrays.toString(b));
        System.out.println("Array 'a' excluding 'b': " + Arrays.toString(diff));
    }
}
