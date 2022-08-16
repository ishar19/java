package javaCode.ArrayProblem;

public class Kadane {
    public int maxSubArray(int[] nums) {
        int max = -10001;
        int sum = -10001;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
