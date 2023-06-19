package ArrayDiff;

import java.util.ArrayList;
import java.util.List;

/*Your goal in this kata is to implement a difference function,
which subtracts one list from another and returns the result.

It should remove all values from list a, which are present
in list b keeping their order.
*/

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        for (int num : a) {
            if (!contains(b, num)) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
