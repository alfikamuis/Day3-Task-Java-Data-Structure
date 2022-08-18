package Soal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Angka_Muncul_Sekali {

    public static void angkaMunculSekali() {
        //String input = "74637929733312";
        System.out.print("Masukkan barisan angka 0-9 tanpa spasi: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] arrInput = input.toCharArray();

        int[] counter = new int[10];
        for (char item: arrInput){
            counter[item - '0']++;
        }

        List<Integer> result = new ArrayList<>(); //hanya untuk tampilan
        for (int index = 0; index < counter.length ; index++){
            if (counter[index] == 1){
                result.add(index);
            }
        }
        System.out.println(result);
    }
}
