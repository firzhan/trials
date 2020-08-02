package org.example.trials;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DataStructure {

    public static void main(String[] args) {




        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();

        set1.add("apple1");
        set1.add("apple2");
        set1.add("apple3");
        set1.add("apple4");
        set1.add("apple5");
        set1.add("apple6");
        set1.add("apple7");

        System.out.println(Arrays.toString(set1.toArray(new String[0])));



      /*  set2.add("apple13");

        Set<String> intersection = new HashSet<String>(set1); // use the copy constructor
        intersection.retainAll(set2);*/

        //System.out.println(intersection);
    }
}
