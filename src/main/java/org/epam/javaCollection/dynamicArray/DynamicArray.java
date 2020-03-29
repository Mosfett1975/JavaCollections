package org.epam.javaCollection.dynamicArray;

import java.util.Arrays;


public class DynamicArray {

   public static int[] myArray;


    public DynamicArray(int sizeOfArray) {

        myArray = new int[sizeOfArray];

    }

    public static void addToArray(int value) {
       myArray = Arrays.copyOf(myArray, myArray.length + 1); //increase length of the array by one
        myArray[myArray.length - 1] = value;
    }


    //get value by index
    public static int get(int getIndex) {
           return myArray[getIndex];
    }

    //decrease size of the array
    public static void removeByIndex(int index) {

        for (int i = index; i < myArray.length -1; i++) {

            myArray[i] = myArray[i + 1];
        }
        myArray = Arrays.copyOf(myArray, myArray.length-1);


    }

    public String toString() {
        return "length of array: " + myArray.length + "\n" + "Contain of array: " + Arrays.toString(myArray);
    }
}
