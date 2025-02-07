package baitap;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        System.out.println("So ki tu trong chuoi: " + s.length());
        scanner.close();
    }

}
