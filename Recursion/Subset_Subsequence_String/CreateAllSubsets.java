package Subset_Subsequence_String;

import java.util.ArrayList;
import java.util.List;
//Time complexity O(n * 2^n)
//Space complexity O(n * 2^n)
public class CreateAllSubsets {
    public static void main(String[] args) {
        // sets("abcde","");
        int [] nums = {1,2,3};
        List<List<Integer>> answer = iter(nums);
        System.out.println(answer);
    }
    static int count =0;
    static void sets(String str, String res){
        if(str.isEmpty()){
            System.out.println(res);
            count++;
            return;
        }
        char ch = str.charAt(0);
        sets(str.substring(1),res+ch);
        sets(str.substring(1),res);
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static List<List<Integer>> iter(int[]arr){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num:arr){
            int n = res.size();
            for(int i = 0; i <n; i++){
                List<Integer> internal = new ArrayList<>(res.get(i));
                internal.add(num);
                res.add(internal);
            }
        }
        return res;
    }
}
