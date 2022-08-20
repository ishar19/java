
public class BinarySearch {
    public static void main(String[] args) {
        int []nums = {1,2,3,45};
        int index = searchArray(nums,0,nums.length-1, 3);
        System.out.println(index);
    }
    static int searchArray(int[]nums, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if(start>end){
            return -1;
        }
        if(nums[mid]==target){
            return mid;
        }
        if (nums[mid] > target) {
            return searchArray(nums,  start,  mid-1,  target);
        }
            return searchArray(nums, mid+1, end, target);


    }
}
