package Soal;

import java.util.Arrays;
import java.util.List;

public class Array_Unique {
    public static void arrayUnique() {
        int[] firstArr = {1,2,3,4};
        Integer[] secondArr = {1,3,5,10,16};
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));

        List<Integer> result = Arrays.asList(secondArr);

        System.out.print("unique array: ");
        for(int item: firstArr){
            if(!result.contains(item)){
                System.out.print(item+" ");
            }
        }
    }
}
