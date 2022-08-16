package javaCode;
import java.util.Scanner;


public class hello{
    public static void main(String[] args){
        // System.out.print("Hello");
        // System.out.println("World");
        // Scanner input = new Scanner(System.in); // Taking input 
        // System.out.println(input.next());
        // // System.out.println(input.nextLine());
        // int rollno = input.nextInt();  //integer input 
        // System.out.println("Your roll number is "  + rollno);
        // String word = input.next();  //String input  
        // String line = input.nextLine();
        // System.out.println(word);
        // System.out.println(line);
        
        // float num = input.nextFloat(); //For float 
        // System.out.println(num);


        //Code for sum of 2 numbers
        // int num1  = input.nextInt();
        // int num2 = input.nextInt();
        // System.out.println(num1 + num2);
        // char c = input.next().charAt(1);
        // System.out.println(c);

        //Typecasting example 

        int num = (int)(69.69f);

        //automatic type promotion in expressions 
        int a = 257;
        byte b = (byte)(a);
        System.out.println("नमस्ते");

        // byte c = 50;
        // byte d = 50*2; //Will give an error because while doing operations on byte java converts into integer hence we cannot assign it into byte 


    }

}

class Student{
    String name;
    int rno;
}

//Literals and Identifiers == In primitive data types, literals are the syntactic representation of the data types  int a = 10; a is identifier and 10 is literal 
//Primitive Data Types   Any data type that you cannot break further
// int rollno = 69;
// char letter = "z"
// float marks = 69.69f
// double big = 1234.5678
// long bigInt = 123456789L
// bool isOK = True or False

//Not primitive
// String name = "Cero"


//Integer rno = 69;   Wrapper classes


//When one type of data is assigned to different type of variable, then automatic type conversion happens if the following conditions are met 
// Example prog asks for a float and you input an integer 
//Basically, the types should be compatible 
//Destinaton type should be greater than source type 