package javaCode;

public class playground {
    public static void main(String[] args) {
        int res = func(134);
        System.out.println(res);
    }
    static int func(int num){
        if(num==0){
            return 0;
        }
        return func(num/10)+num%10;
    }
}
