package baitapvenha;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.print("Mang dao nguoc la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }
    }

}
