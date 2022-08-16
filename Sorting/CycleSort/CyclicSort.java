package javaCode.Sorting.CycleSort;


//When number given in range 1 to N, then think about cyclic sort
public class CyclicSort {
    public static void main(String[] args) {
        
    }

    static void sort(int[] nums){
        int i = 0;
        while(i<=nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                //swap(arr, i, correctIndex)
            }else{
                i+=1;
            }
        }
    }
}
