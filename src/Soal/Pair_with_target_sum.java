package Soal;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_with_target_sum {
    public static void pair() {
        System.out.println("masukkan array (contoh: 1,2,3,4,5): ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] stringsArr = a.split(",");
        int[] arr = Arrays.stream(stringsArr).mapToInt(Integer::parseInt).toArray();

        //int[] arr = {1,2,3,4,6};
        //System.out.println("dari array: "+Arrays.toString(arr));
        System.out.print("Masukkan hasil penjumlahan: ");
        int target = scan.nextInt();

        for(int firstIndex = 0 ; firstIndex <arr.length;firstIndex++){
            for(int secondIndex = firstIndex+1 ; secondIndex <arr.length; secondIndex++){
                if(arr[firstIndex]+arr[secondIndex] == target){
                    System.out.printf("pada index [%d ,%d]\n",firstIndex,secondIndex);
                }
            }
        }
    }

    public static void pairOptimized() {

    }

}
