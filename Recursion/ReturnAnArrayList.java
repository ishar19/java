package javaCode.Recursion;

import java.util.ArrayList;

public class ReturnAnArrayList {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,7,8};
        ArrayList<Integer> res = func(nums, 7, 0);
        System.out.println(res);
    }
    static ArrayList<Integer> func(int[] nums, int target,int  index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == nums.length){
            return list;
        }
        if(nums[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = func(nums, target, index+1);
        list.addAll(ansFromBelow);
        return list;
    }
}
