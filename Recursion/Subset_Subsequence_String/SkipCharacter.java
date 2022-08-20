package Subset_Subsequence_String;


public class SkipCharacter {
    public static void main(String[] args) {
        func("aabcdeaf","");
    }
    static void func(String str, String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            func(str.substring(1),res);
        }
        else{
            func(str.substring(1),res+ch);
        }
    }
}


//same thing we can do with skip string like apple with string.startwith(apple) and string.substring(5)