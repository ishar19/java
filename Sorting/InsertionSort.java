package javaCode.Sorting;
//Partially Sorting the array, one index at a  time  

//It's adaptive, stable, partially sorted
public class InsertionSort {
    public static void main(String[] args) {
        
    }

    static void Sorting(int[] nums){
        for(int i=0; i < nums.length-1; i++){
            for(int j=i+1; j < 0;j--){
                if(nums[j] < nums[j-1]){
                    //swap
                }
                else{
                    break;
                }
            }
        }
    }
}
