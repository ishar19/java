package javaCode.Recursion;

import java.util.Arrays;

//O(nlog(n))

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 4, 6, 7 };
        int[] res = mergeSort(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length)); // args are exclusive

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                res[k] = left[i];
                i++;
                k++;
            } else {
                res[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            res[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            res[k] = right[j];
            k++;
            j++;
        }
        return res;
    }
}