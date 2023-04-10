package Cilsy;

import java.util.Scanner;

public class Latihan_April2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Bilangan Awal: ");
        int awal = input.nextInt();
        System.out.print("Input Bilangan Akhir: ");
        int akhir = input.nextInt();
        int ganjil = 0;
        int genap = 0;
        for (int i = awal; i <= akhir; i++) {
            boolean isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                }
            }
            if (isPrima == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println("merupakan bilangan prima");
        for (int i = awal; i < akhir; i++) {
            boolean isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                }
            }
            if (isPrima == true && i % 2 > 0) {
                ganjil++;
                System.out.print(i + " ");
            }
        }
        System.out.println("merupakan bilangan prima ganjil");
        for (int i = awal; i < akhir; i++) {
            boolean isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                }
            }
            if (isPrima == true && i % 2 == 0) {
                genap++;
                System.out.print(i + " ");
            }
        }
        System.out.println("merupakan bilangan prima genap");
        System.out.println();
        System.out.println("bilangan prima ganjil berjumlah : " + ganjil);
        System.out.println("bilangan prima genap berjumlah : " + genap);
    }
}