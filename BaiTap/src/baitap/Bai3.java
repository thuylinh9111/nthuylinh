package baitap;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Chuoi dao nguoc la: " + reversed);
        scanner.close();
    }

}
