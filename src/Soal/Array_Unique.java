package Soal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array_Unique {
    public static void arrayUnique() {
        System.out.println("masukkan 2 array (contoh: 1,2,3,4,5): ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] firstArray = a.split(",");
        String b = scan.nextLine();
        String[] secondArray = b.split(",");
        int[] firstArr = Arrays.stream(firstArray).mapToInt(Integer::parseInt).toArray();
        Integer[] secondArr = Arrays.stream(secondArray).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        //int[] firstArr = {1,2,3,4};
        //Integer[] secondArr = {1,3,5,10,16};
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
