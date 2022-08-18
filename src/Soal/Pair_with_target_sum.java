package Soal;

import java.util.Scanner;

public class Pair_with_target_sum {
    public static void pair() {
        System.out.print("Masukkan hasil penjumlahan: ");
        Scanner scan = new Scanner(System.in);
        //int target = scan.nextInt();

        int target = 6;
        int[] arr = {1,2,3,4,6};
        for(int firstIndex = 0 ; firstIndex <arr.length;firstIndex++){
            for(int secondIndex = firstIndex+1 ; secondIndex <arr.length; secondIndex++){
                if(arr[firstIndex]+arr[secondIndex] == target){
                    System.out.printf("[%d ,%d]",firstIndex,secondIndex);
                }
            }
        }
    }

    public static void pairOptimized() {

    }

}
