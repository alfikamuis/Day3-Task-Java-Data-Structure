package Soal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Remove_duplicates {
    public static void removeDuplicates() {
        System.out.println("duplikasi array (contoh: 2,3,3,3,6,9,9): ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] input = a.split(",");
        int[] intArr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        //int[] input = {2,3,3,3,6,9,9};
        System.out.println("before \t: "+ Arrays.toString(input));

        HashSet<Integer> result = new HashSet<>();
        for(int item : intArr){
            result.add(item);
        }

        System.out.println("output \t: "+ result.size());
        System.out.println("after \t: "+result);
    }
}
