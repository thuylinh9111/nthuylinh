package baitapvenha;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int n = array.length;
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max: "+ max);
        System.out.print("Min: "+ min);
        for (int i = 1; i < n; i++) {
            System.out.println();

        }
    }

}
