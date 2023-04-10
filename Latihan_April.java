package Cilsy;

import java.util.Scanner;

public class Latihan_April {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int value = input.nextInt();
        for (int i = value; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = value; j <= 10; j++) {
            if (j % 2 > 0) {
                System.out.print(j + " ");
            }
        }
            System.out.println("merupakan bilangan ganjil");

            for (int k = value; k <= 10; k++) {
                if (k % 2 == 0) {
                    System.out.print(k + " ");
                }
            }
                System.out.println("merupakan bilangan genap");
            }
        }
