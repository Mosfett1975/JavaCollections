import java.util.ArrayList;


public class DynamicArray {

public static ArrayList<Integer> myArray = new ArrayList<Integer>(3);

public static void addToArray (int value){
    myArray.add(value);
}

public static int get(int getIndex){
    return myArray.get(getIndex);
}

public static void removeByIndex (int index){
    myArray.remove(index);
}


}
