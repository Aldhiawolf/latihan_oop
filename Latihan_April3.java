package Cilsy;

import java.util.Scanner;

public class Latihan_April3 {
    static int hitungluas(int p, int l) {
        int luas = p * l;
        return luas;
    }
        static int hitungkeliling(int p, int l) {
        int keliling = 2 * (p + l);
        return keliling;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Input Lebar: ");
        int lebar = input.nextInt();

        int luas = hitungluas(panjang, lebar);
        int keliling = hitungkeliling(panjang, lebar);
        System.out.println("Luasnya adalah : " + luas);
        System.out.println("Kelilingnya adalah : " + keliling);
    }
}
