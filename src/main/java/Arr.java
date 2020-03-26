import java.util.Arrays;

public class Arr {


    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

/**fill the array **/

        for (int i = 0; i < dynamicArray.myArray.length; i++) {
            dynamicArray.myArray[i] = i;
        }

/** add new element with value to the end of the array **/

dynamicArray.addToArray(5);

/** get value from the array by index **/
dynamicArray.get(5);

/** Display condition of th array **/
Arrays.asList(dynamicArray).forEach(System.out::println);

/** Delete element from the array **/
        dynamicArray.removeByIndex(3);

/** Show a result **/
Arrays.asList(dynamicArray).forEach(System.out::println);

    }

}
