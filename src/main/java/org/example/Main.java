package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        List<Integer> question = Arrays.asList(0, 2, 3, 2, 4, 3, 6, 7, 2);
        System.out.println(removeDuplicate(question));

        String str = "I am a sm'art boy?";
        String[] arr = str.split("' ");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static List<Integer> removeDuplicate(List<Integer> sample){
        //convert the LinkedList to a set because a set cannot hold more than one identical key
//        List<Integer> names = Arrays.asList(0, 2, 3, 2, 4, 3, 6, 7, 2);
    Set<Integer> nameSet = new HashSet<>(sample);

    //convert the set back to a LinkedList
    //    Set<Integer> nameSet = new HashSet<>(Arrays.asList(0, 2, 3, 2, 4, 3, 6, 7, 2));
    List<Integer> result = new ArrayList<>(nameSet);


        return result;
    }

    //        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < sample.size(); i++) {
//            if (result.contains(sample.get(i))){
//                i++;
//            }
//            result.add(sample.get(i));

    //
//        }
//        List<Integer> names = Arrays.asList(0, 2, 3, 2, 4, 3, 6, 7, 2);
//    Set<Integer> nameSet = new HashSet<>(sample);
    //    Set<Integer> nameSet = new HashSet<>(Arrays.asList(0, 2, 3, 2, 4, 3, 6, 7, 2));
//    List<Integer> result = new ArrayList<>(nameSet);




}
