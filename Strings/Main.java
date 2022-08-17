package javaCode.Strings;

public class Main {
    public static void main(String[] args) {
        String name = "Cero";
        String name2 = "Cero";
        String name3 = new String("Cero");
        System.out.println(name==name3);
        System.out.println(name == name2);  //True name and name2 refers to the same place in the heap memory 
        System.out.println(name.equals(name2)); //true
        name = "dERO";
        System.out.println(name);//dERO
        System.out.println(name2);//Cero  //Beacuse of immutability

        Integer a = 10;
        Integer b = new Integer(10);
        System.out.println(a==b); //false
        System.out.println(a.equals(b)); //true
        System.out.println(name.charAt(0));

        //Pretty Printing 
        float f = 3.145f;
        System.out.printf("Format string %.2f", f); 

        //String Concat
        System.out.println('a'+'b'); //195
        System.out.println("a"+"b"); //concat ab
        System.out.println('a'+3); //100
        System.out.println((char)('a' + 3));//d
        System.out.println("a"+1); //a1

        //If one of the data type is string, answer is String 


        //integer will be converted into wrapper class Integer which calls toString
        //Same with this 
        System.out.println("Xero" + new Integer(1));//Xero1

        //NOTE one of the objects should be string or use with primitives
        //This wont work (new Integer + new ArrayList<>())
        //btw this will work (new Integer + " "+ new ArrayList<>())

        //Format specifiers
        System.out.printf("My name is %s ", "Ishar");

    }
}


//String Pool   Seperate memory Structure inside the heap so that no need to create similar strings again
//String immutability
