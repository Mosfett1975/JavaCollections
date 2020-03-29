package org.epam.javaCollection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class RunStream {
    static int sizeOfArray = 1000000;


    public static void main(String[] args) {


/** Create collection **/
        ArrayList<Integer> list = new ArrayList<>();


/** Fill collection with sequence 0 - 1000000 **/

        for (int i = 0; i < sizeOfArray; i++) {
            list.add(i);
        }


/** Remove odd elemets from list. Only tenth part of array**/
        Stream<Integer> stream = list.stream();
       stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

    }



}
