
public class RotadedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {6,7,8,1,2,3,4};
        int res = func(nums,0,nums.length - 1, 3);
        System.out.println(res);
    }

    static int func(int[] arr,int start, int end,int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target<=arr[mid]&&target>=arr[start]){
                return func(arr, mid+1, end, target);
            }
            else{
                return func(arr, mid+1, end, target);
            }
        }
        if(target>=arr[mid]&&target<=arr[end]){
            return func(arr, mid + 1, end, target);
        }
        return func(arr, mid + 1, end, target);

    }
}


