package org.epam.javaCollection;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class RunStream {
    static int sizeOfArray = 1000000;


    public static void main(String[] args) {


/** Create collection **/
        List<Integer> list = new ArrayList<>();


/** Fill collection with sequence 0 - 1000000 **/
        IntStream.range(0, sizeOfArray).forEach(list::add);

/** shuffle the list **/
        Collections.shuffle(list);


/** Check for uniqueness of elements -
 Set always contains only unique keys **/
        HashSet h = new HashSet();
        list.stream().forEach(h::add);
        if (list.size() == h.size()) System.out.println("List contains only unique keys!");


/** Remove odd elemets from list. Only tenth part of array**/
       list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List firstTen = list.subList(0, 10);
        System.out.println("Display that the list has even numbers only  - " + firstTen);


    }


}
