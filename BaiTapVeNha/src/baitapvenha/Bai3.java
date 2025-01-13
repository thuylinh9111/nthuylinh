package baitapvenha;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        int n = scanner.nextInt();
        if (n % 4 == 0) {
            System.out.println("La nam nhuan " + n);
        } else {
            System.out.println("Khong phai la nam nhuan " + n);
        }
    }
}
