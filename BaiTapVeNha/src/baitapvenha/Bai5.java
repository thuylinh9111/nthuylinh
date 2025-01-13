package baitapvenha;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("La so lon nhat" + a);
        } else if (b > a && b > c) {
            System.out.println("La so lon nhat " + b);
        } else if (c > a && c > b) {
            System.out.println("La so lon nhat " + c);
        } else {
            System.out.println("Cac so deu bang nhau");
        }
    }
}
