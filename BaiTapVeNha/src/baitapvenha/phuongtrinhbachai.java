package baitapvenha;

import java.util.Scanner;

public class phuongtrinhbachai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextFloat();
        System.out.println("Nhap b: ");
        double b = scanner.nextFloat();
        System.out.println("Nhap c: ");
        double c = scanner.nextFloat();
        double delta = b * b - 4 * a * c;
        System.out.println("Delta: " + delta);
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem la: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem kep la: " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
