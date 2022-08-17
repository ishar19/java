package javaCode.Recursion;

public class HelloWorld {
    public static void main(String[] args) {
        message(5);
    }
   
   static void message(int num){
    if(num==0){
        return;
    }
    else{
        message(num-=1);
    }
    System.out.println("Hello World!");
   }
}


//when the last statement is a function call, it is called tail recursion


//NOTES
//what to pass
//the base condition
//the body
// where to put return statement and function call