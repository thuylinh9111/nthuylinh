package baitap;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = scanner.nextLine().trim();
        String[] words = str.split("\\s+");
        System.out.println("So tu trong chuoi: " + words.length);
        scanner.close();
    }
}
