package baitap;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine().trim();
        System.out.println("Chuoi sau khi loai bo khoang trang: " + s);
        scanner.close();
    }
}
