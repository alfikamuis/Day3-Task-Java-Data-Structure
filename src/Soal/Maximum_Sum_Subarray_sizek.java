package Soal;

import java.util.Arrays;

public class Maximum_Sum_Subarray_sizek {
    public static void maximumSumK() {
        //int[] inputArr = {2,1,5,1,3,2};
        int[] inputArr = {2,3,4,1,5};
        int k = 2;
        System.out.println("before \t: "+ Arrays.toString(inputArr) + "k="+ k);

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
        System.out.println(maxSum);
    }

}
