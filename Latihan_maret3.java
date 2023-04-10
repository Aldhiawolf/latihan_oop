package Cilsy;

import java.util.Scanner;

public class Latihan_maret3 {
    public static void main(String[] args) {
        System.out.println("========G A N J I L - G E N A P========");
        System.out.println("===================================================");
        Scanner input = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        int value = input.nextInt();
        for (int i = value; i <= 10; i++) {
            if (value % 2 > 0) {
                if (i % 2 > 0) {
                System.out.print(i + " ");
            }
        }
        else {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
