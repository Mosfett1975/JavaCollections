//import java.util.*;
//
//public class Run {
//    public static int sizeOfArray = 1000000;
//
//    public static void main(String[] args) {
//
//        DynamicArray dynamicArray = new DynamicArray();
//
///** Fill collection with sequence 0 - 1000000 **/
//
//        for (int i = 0; i < sizeOfArray; i++) {
//            dynamicArray.addToArray(i);
//        }
//
//
///** Display minimal element and last by one element **/
//
//        System.out.println(dynamicArray.get(0) + " - This is minimal element");
//        System.out.println(dynamicArray.get(dynamicArray.myArray.size() - 1) + " - This is last by one element");
//
//
//
///** Check for uniqueness of elements -
// Map always contains only unique keys **/
//
//        HashSet h = new HashSet();
//        for (int i = 0; i < dynamicArray.myArray.size(); i++) {
//            h.add(dynamicArray.get(i));
//        }
//        if (dynamicArray.myArray.size() == h.size()) System.out.println("List contains only unique keys!");
//
//
///** Remove odd elemets from list. Only tenth part of array**/
//for (int i =0; i< dynamicArray.myArray.size()/10; i++){
//    if (!(dynamicArray.get(i) % 2 == 0)) {
//        dynamicArray.removeByIndex(i);
//    }
//}
//
///** Display that all odd elements were removed. Fist 10 elements only **/
//       for (int i = 0; i < 10; i++){
//           System.out.println(dynamicArray.get(i));
//       }
//
//
//
///**
// Organize random access
// selects the first 7 values ​​from a mixed list
// and demonstrate that the order is arbitrary
// **/
//        Collections.shuffle(dynamicArray.myArray);
//        List firstSix = dynamicArray.myArray.subList(0, 7);
//        System.out.println("Display that the order is arbitrary  - " + firstSix);
//
//    }
//
//
//
//
//}
