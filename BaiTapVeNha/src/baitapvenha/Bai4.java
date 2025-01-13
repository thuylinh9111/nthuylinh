package baitapvenha;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Chu nhat");
        } else if (a == 2) {
            System.out.println("Thu Hai");
        } else if (a == 3) {
            System.out.println("Thu Ba");
        } else if (a == 4) {
            System.out.println("Thu Tu");
        } else if (a == 5) {
            System.out.println("Thu Nam");
        } else if (a == 6) {
            System.out.println("Thu Sau");
        } else {
            System.out.println("Thu Bay");
        }
    }

}
