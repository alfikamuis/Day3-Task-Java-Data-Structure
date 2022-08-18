package Soal;

import java.util.Scanner;

public class Angka_Muncul_Sekali {

    public static void angkaMunculSekali() {
        //String input = "74637929733312";
        System.out.println("Masukkan barisan angka 0-9 tanpa spasi: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] arrInput = input.toCharArray();

        int[] counter = new int[input.length()];
        for (char item : arrInput) {
            counter[item - '0']++;
        }

        System.out.println("output: ");
        for (int index = 0; index < counter.length; index++) {
            if (counter[index] == 1) {
                System.out.print(index + " ");
            }
        }
    }
}
