package javaCode;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        int count = 0;
        if (true) {
            System.out.println("hello world");
        }
        while (count != 5) {
            System.out.println(count);
            count += 1;
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(i);
        }

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        int a = 7;
        int b = a;
        if (a == b) {
            System.out.println("yes");
        }

        if (fruit == "mango") {
            System.out.println("True"); // This wont print because == also checks the reference of the comparators
        }
        if (fruit.equals("mango")) {
            System.out.println("False");
        }

        // Switch statements

        switch (fruit) {

            case "mango":
                System.out.println("mango");
                break;
            case "apple":
                System.out.println("apple");
                break;
            case "banana":
                System.out.println("banana");
                break;
            default:
                System.out.println("I don't know");
        }
    }
}
