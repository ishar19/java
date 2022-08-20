
public class IsArraySorted {
    public static void main(String[] args) {
        int[] nums = {1,5,3,4};
        boolean res = isSorted(nums, 0);
        System.out.println(res);
    }

    static boolean isSorted(int[] nums, int index){
        if(index==nums.length-1) return true;
        return nums[index]<nums[index+1] && isSorted(nums,++index);
    }
}
