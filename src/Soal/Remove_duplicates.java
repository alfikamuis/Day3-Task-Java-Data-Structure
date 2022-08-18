package Soal;

import java.util.Arrays;
import java.util.HashSet;

public class Remove_duplicates {
    public static void removeDuplicates() {
        int[] input = {2, 3, 3, 3, 6, 9, 9};
        System.out.println("before \t: "+ Arrays.toString(input));

        HashSet<Integer> result = new HashSet<>();
        for(int item : input){
            result.add(item);
        }

        System.out.println("output \t: "+ result.size());
        System.out.println("after \t: "+result);
    }
}
