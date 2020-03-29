package org.epam.javaCollection;

import java.util.*;

public class RunCollection {
    static int sizeOfArray = 1000000;


    public static void main(String[] args) {

/** Create collection **/
       ArrayList<Integer> list = new ArrayList();


/** Fill collection with sequence 0 - 1000000 **/

        for (int i = 0; i < sizeOfArray; i++) {
            list.add(i);
        }

/**
 Organize random access
 selects the first 7 values ​​from a mixed list
 and demonstrate that the order is arbitrary
 **/
        Collections.shuffle(list);
        List firstSix = list.subList(0, 7);
        System.out.println("Display that the order is arbitrary  - " + firstSix);

/** Check for uniqueness of elements -
 Map always contains only unique keys **/

        HashSet h = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            h.add(list.get(i));
        }
        if (list.size() == h.size()) System.out.println("List contains only unique keys!");

/** Find minimal elements in collection **/

        System.out.println(Collections.min(list) + " - This is minimal element");

/** Remove odd elemets from list. Only tenth part of array**/
    list.removeIf(i -> i %2 !=0);


/** Display that all odd elements were removed. Fist 10 elements only **/
       for (int i = 0; i < 10; i++){
           System.out.println(list.get(i));
       }

/** Find last by one element in collection **/

        System.out.println(Collections.max(list) - 2 + " - This is maхimal element");

    }


}
