package org.epam.javaCollection;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static javafx.scene.input.KeyCode.T;

public class RunStream {
    static int sizeOfArray = 1000000;

    public static void main(String[] args) {

/** Create list **/
      List<Integer> list = new ArrayList<>();



/** Fill list with sequence 0 - 1000000 **/
        IntStream.range(0, sizeOfArray).forEach(list::add);

/** shuffle the list **/
        Collections.shuffle(list);

/** Get minimal value in list **/
System.out.println(list.stream().min(Integer::compare).get() + " - This is minimal value");

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

///** Check for uniqueness of elements -
// Set always contains only unique keys **/
//        HashSet h = new HashSet();
//        list.stream().forEach(h::add);
//        if (list.size() == h.size()) System.out.println("List contains only unique keys!");


/** Remove odd elemets from list. Only tenth part of array**/
       list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List firstTen = list.subList(0, 10);
        System.out.println("Display that the list has even numbers only  - " + firstTen);

        List<Integer> distinctElements = list.stream().filter(distinctByKey(p -> p.getClass())).collect(Collectors.toList());

        System.out.println(distinctElements + "fdfd");

        System.out.println(list.stream().filter(distinctByKey(list::add)) + "dsfsdfs");

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

}
