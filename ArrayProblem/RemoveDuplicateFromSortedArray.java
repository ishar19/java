package javaCode.ArrayProblem;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)
            return 1;

        // c -> slow pointer, used to move unique elements to the front
        // i -> fast pointer, checks entire array for unique elements
        int c, i;

        for (c = 1, i = 1; i < nums.length; i++) {
            // if nums[i] is DIFFERENT than nums[i-1], it's unique; set nums[c] to that and
            // move forward
            if (nums[i] != nums[i - 1]) {
                nums[c] = nums[i];
                c++;
            }
            // otherwise, keep c where it is. only i moves forward
        }
        return c;
    }
}