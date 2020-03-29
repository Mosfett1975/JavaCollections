package org.epam.javaCollection;

import org.epam.javaCollection.dynamicArray.DynamicArray;

import java.util.Arrays;

public class RunDynamicArray {


    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

/**fill the array **/

        for (int i = 0; i < dynamicArray.myArray.length; i++) {
            dynamicArray.myArray[i] = i;
        }

/** add new element with value to the end of the array **/

dynamicArray.addToArray(5);


/** get value from the array by index **/
System.out.println(dynamicArray.get(3));


/** Display condition of the array **/
Arrays.asList(dynamicArray).forEach(System.out::println);


/** Delete element from the array **/
        dynamicArray.removeByIndex(3);


/** Show a result **/
Arrays.asList(dynamicArray).forEach(System.out::println);

    }

}
