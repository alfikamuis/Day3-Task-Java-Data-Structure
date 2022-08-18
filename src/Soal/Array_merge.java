package Soal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_merge {
    public static void arrayMerge(){
        String[] firstArray = {"kazuya","jin","lee"};
        String[] secondArray = {"kazuya","feng"};
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        String[] input = new String[firstArray.length +secondArray.length];
        System.arraycopy(firstArray,0,input,0,firstArray.length);
        System.arraycopy(secondArray,0,input,firstArray.length,secondArray.length);

        List<String> arr = new ArrayList<>();
        for (String item: input){
            if(arr == null || !arr.contains(item) ){arr.add(item);}
        }

        System.out.println("Hasil merge: "+arr);
    }

    public static void arrayMergeManual2D(){
        String[][] userInput = {{"kazuya","jin","lee"},{"kazuya","feng"}};

        List<String> arr = new ArrayList<>();
        for(String[] input : userInput){
            for (String item: input){
                if(arr == null || !arr.contains(item) ){arr.add(item);}
            }
        }

        System.out.println(arr);
    }
}
