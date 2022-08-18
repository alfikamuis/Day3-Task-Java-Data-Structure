package Soal;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Sum_Subarray_sizek {
    public static void maximumSumK() {
        System.out.println("masukkan array (contoh: 1,5,1,3,2): ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] input = a.split(",");
        int[] inputArr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        //int[] inputArr = {2,1,5,1,3,2};
        //int[] inputArr = {2,3,4,1,5};
        System.out.println("before\t: "+ Arrays.toString(inputArr));

        System.out.print("nilai k\t: ");
        int k = scan.nextInt();


        int maxSum = 0;
        for(int index = 0; index < k ;index++){ //max sum pertama
            maxSum += inputArr[index];
        }

        int movingSum = maxSum;
        for(int index = 1; index <= inputArr.length-k; index++){
            movingSum = movingSum - inputArr[index-1] + inputArr[index+(k-1)];
            if(movingSum > maxSum){
                maxSum = movingSum;
            }
        }
        System.out.printf("Maximum sum dari %d angka: %d",k,maxSum);
    }

}
