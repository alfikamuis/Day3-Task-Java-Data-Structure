import Soal.*;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        boolean soal = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("\tTask-Day3 Alterra"+"\n"+"============================");
        System.out.println("\t1. Array Merge");
        System.out.println("\t2. Angka muncul sekali");
        System.out.println("\t3. Pair with target Sum");
        System.out.println("\t4. Array unique");
        System.out.println("\t5. Remove duplicates");
        System.out.println("\t6. Maximum sum subarray of size K");
        System.out.println("\t7. Exit");

        while (soal){
            System.out.print("Pilihan: ");

            int pilihanUser = scan.nextInt();
            //clearScreen();
            System.out.println();
            switch (pilihanUser) {
                case 1 -> Array_merge.arrayMerge();
                case 2 -> Angka_Muncul_Sekali.angkaMunculSekali();
                case 3 -> Pair_with_target_sum.pair();
                case 4 -> Array_Unique.arrayUnique();
                case 5 -> Remove_duplicates.removeDuplicates();
                case 6 -> Maximum_Sum_Subarray_sizek.maximumSumK();
                case 7 -> soal = false;
                default -> System.out.println("Pilihan salah/ diluar dari 1-9");

            }
            System.out.print("\n");
        }
        scan.close();
    }

    public static void clearScreen() {
        //gunakan untuk di terminal
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa cls");
        }
    }
}
