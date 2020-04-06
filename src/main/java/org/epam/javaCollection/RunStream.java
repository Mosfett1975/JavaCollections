package org.epam.javaCollection;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.IntStream;


public class RunStream {
    static int sizeOfArray = 1000000;

    public static void main(String[] args) {

/** Create list **/
      List<Integer> list = new ArrayList<>();

/** Fill list with sequence 0 - 1000000 **/
        IntStream.range(0, sizeOfArray).forEach(list::add);

/** shuffle the list **/
        Collections.shuffle(list);

/** Check for uniqueness of elements **/
        List<Integer> distinctElements = list.stream()
                .filter(distinctByKey(p -> p.intValue()))
                .collect(Collectors.toList());
        if (list.size() == distinctElements.size()) System.out.println("List contains only unique keys!");


/** Get minimal value in list **/
System.out.println(list.stream().min(Integer::compare).get() + " - This is minimal value");



/** Remove odd elemets from list. Only tenth part of array**/
       list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List firstTen = list.subList(0, 10);
        System.out.println("Display that the list has even numbers only  - " + firstTen);





    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

}
