package Soal;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_with_target_sum {
    public static void pair() {
        int[] arr = {1,2,3,4,6};
        System.out.println("dari array: "+Arrays.toString(arr));
        System.out.print("Masukkan hasil penjumlahan: ");
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();

        for(int firstIndex = 0 ; firstIndex <arr.length;firstIndex++){
            for(int secondIndex = firstIndex+1 ; secondIndex <arr.length; secondIndex++){
                if(arr[firstIndex]+arr[secondIndex] == target){
                    System.out.printf("pada index [%d ,%d]",firstIndex,secondIndex);
                }
            }
        }
    }

    public static void pairOptimized() {

    }

}
