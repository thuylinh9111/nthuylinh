package baitap;

import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        System.out.print("Nhap tu can thay the: ");
        String oldWord = scanner.nextLine();
        System.out.print("Nhap tu thay the: ");
        String newWord = scanner.nextLine();

        String newStr = s.replace(oldWord, newWord);
        System.out.println("Chuoi sau khi thay the: " + newStr);
        scanner.close();
    }
}
