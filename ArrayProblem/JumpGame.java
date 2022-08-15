package javaCode.ArrayProblem;
//https://leetcode.com/problems/jump-game/discuss/2422681/very-simple-java-code-in-O(n)-time-complexity
public class JumpGame {
    public boolean canJump(int[] nums) {
        int needed = 1;
        int n = nums.length;
        for (int a = n - 2; a >= 0; a--) {
            if (nums[a] < needed) {
                needed++;
            } else {
                needed = 1;
            }
        }
        if (needed == 1) {
            return true;
        }
        return false;
    }
}
