package Soal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_merge {
    public static void arrayMerge(){
        System.out.println("masukkan 2 array (contoh: kazuya,jin,lee): ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] firstArray = a.split(",");
        String b = scan.nextLine();
        String[] secondArray = b.split(",");

        //String[] firstArray = {"kazuya","jin","lee"};
        //String[] secondArray = {"kazuya","feng"};

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
