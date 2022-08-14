package javaCode;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // dataType[] variableName = new dataType[size]; or int[] nums = {1,2,3,4,5};
        //Arrays.toString(arr)   Get you the whole array from the address
        // array of objects
        Scanner in = new Scanner(System.in);

        // //Arrays

        // String[] arr = new String[4];
        // for(int i =0;i<arr.length;i++){
        //     arr[i] = in.next();
        // }
        // System.out.println(Arrays.toString(arr));

        //Multidimensional Arrays

        int arr[][] = new int[3][5];// no of columns is not necessary to specify
        // arr.length = no. of rows

        ArrayList <Integer> list  = new ArrayList<>(); // also give the data type with new but it's not necessary

        //Primitive cannot be passed in ArrayList, wrapper classes must be passed
        list.add(69);
        list.add(70);
        list.add(71);

        System.out.println(list);


        list.contains(69);  // check if it contains
        list.set(0, 70);  // set 0th index to 70
        list.remove(2);  // remove index number 2
        System.out.println(list);
        System.out.println(list.get(0)); // get an index

    }
}
