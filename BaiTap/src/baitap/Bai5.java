package baitap;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        System.out.print("Nhap ki tu can dem: ");
        char a = scanner.next().charAt(0);

        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                dem++;
            }
        }

        System.out.println("So lan xuat hien cua '" + a + "': " + dem);
        scanner.close();
    }
}
