package org.epam.javaCollection;

import java.util.*;

public class RunCollection {
    static int sizeOfArray = 1000000;


    public static void main(String[] args) {

/** Create list **/
       List<Integer> list = new ArrayList();


/** Fill list with sequence 0 - 1000000 **/

        for (int i = 0; i < sizeOfArray; i++) {
            list.add(i);
        }

/**
 Organize random access
 selects the first 7 values ​from a mixed list
 and demonstrate that the order is arbitrary
 **/
        Collections.shuffle(list);
        List firstSix = list.subList(0, 6);
        System.out.println("Display that the order is arbitrary  - " + firstSix);

/** Check for uniqueness of value -
 Map always contains only unique keys **/

        HashSet h = new HashSet();
        list.forEach(i-> h.add(list.get(i)));
        if (list.size() == h.size()) System.out.println("List contains only unique keys!");

/** Find minimal value in collection **/

        System.out.println(Collections.min(list) + " - This is minimal value");

/** Remove odd values from list.**/
    list.removeIf(i -> i %2 !=0);


/** Display that all odd values were removed. Fist 10 value only **/
       for (int i = 0; i < 10; i++){
           System.out.println(list.get(i));
       }

/** Find last but one value in collection **/
        List butOne = list.subList(0, list.size());
        butOne.remove(Collections.max(butOne));
        System.out.println(Collections.max(butOne) + " This is last but one value");
        System.out.println(list.indexOf(Collections.max(butOne)) + " This is index of the last but one value");

    }


}
