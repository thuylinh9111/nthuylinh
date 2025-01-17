package baitapvenha;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Output : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] uniqueArr = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean trungLap = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == uniqueArr[j]) {
                    trungLap = true;
                    break;
                }
            }
            if (!trungLap) {
                uniqueArr[index++] = arr[i];
            }
        }
        System.out.print("Unique Output: ");
        for (int i = 0; i < index; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}
