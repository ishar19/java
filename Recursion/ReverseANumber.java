package javaCode.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 321;
        rev1(num);
        System.out.println(sum);
    }
    static int sum =0;
    static void rev1(int num) {
        if(num==0){
            return;
        }
        int rem = num%10;
        sum = sum*10+rem;
        rev1(num/10);

    }
    
  
}
