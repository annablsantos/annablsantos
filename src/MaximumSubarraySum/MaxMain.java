package MaximumSubarraySum;

import static MaximumSubarraySum.Max.sequence;

public class MaxMain {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = sequence(arr);
        System.out.println("Maximum: " + maxSum);
    }
}
