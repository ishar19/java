package Permutation;

import java.util.ArrayList;
import java.util.List;

public class Phonepad {
    public static void main(String[] args) {
       ArrayList<String> answer = funcList("","12");
       System.out.println(answer);
    }
    static void func(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a'+i);
            func(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> funcList(String p, String up) {
        ArrayList<String> ans = new ArrayList<String>();
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 2) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(funcList(p + ch, up.substring(1)));
        }
        return ans;
    }
}
