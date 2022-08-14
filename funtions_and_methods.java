package javaCode;

import java.util.Scanner;
import java.util.Arrays;

public class funtions_and_methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
    
        // int ans = sum(num1 , num2); 
        // String message = greet(input.nextLine());
        // System.out.println(message);


        int[] nums = {1,2,3,54};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums){
        nums[0]=99;
    }

    // static int sum(int num1, int num2){
    //     return num1+num2;
    // }

    // static String greet(String name){
    //     return "Hello" + name;
    // }
}


//There is no pass by reference in Java, it's pass by value of the copy of reference 