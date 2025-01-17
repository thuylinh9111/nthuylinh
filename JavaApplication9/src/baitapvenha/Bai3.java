package baitapvenha;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int n = array.length;
        boolean doixung = true;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                doixung = false;
                break;
            }
        }
        if (doixung) {
            System.out.println("La mang doi xung");
        } else {
            System.out.println("Khong la mang doi xung");
        }
    }
}
