package com.in28minutes.java.string;

import com.in28minutes.java.collections.examples.ListExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
       //  ListExample listExample = new ListExample();
        int[] in;
        in = new int[5];

        char[] ch = new char[10];

        seprateCharNum();
        findDuplicate();

    }

    private static void seprateCharNum() {

        String s = "12213ghjg768_";
        s = s.replaceAll("_", "");
        ArrayList lsNum = new ArrayList();
        ArrayList<Character> lsChar = new ArrayList();
        List<Character> number = Arrays.asList('0', '1','2' ,'3', '4', '5', '6', '7', '8', '9');
        for (char ch : s.toCharArray()) {
            if (number.contains(ch)) {
                lsNum.add(ch);
            }
            if (!(number.contains(ch))) {
                lsChar.add(ch);
            }
        }
        System.out.println("lsNum :" + lsNum + "and lschar :" + lsChar);


    }

    private static void findDuplicate(){

        int[] arr = {1,3,4,5,2,4,2};
        String str = "aabbbccdda";


        Set<Integer> setD = Arrays.asList(1,3,4,5,2,4,2).stream().sorted().collect(Collectors.toSet());

        Map<String, Long> freq = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("setD :" + setD.toString() + " freq :" + freq);

    }
}
