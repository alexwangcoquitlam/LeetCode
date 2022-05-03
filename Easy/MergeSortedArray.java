package Easy;

import java.util.Arrays;
import java.util.Random;

public class MergeSortedArray {
    public static void main(String[] args) {
        // #88
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, element = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[element--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[element--] = nums2[j--];
        }
    }
}
