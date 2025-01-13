package baitapvenha;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        double n = scanner.nextDouble();
        if (n >= 8) {
            System.out.println("Gioi");
        } else if (n > 6.5 && n < 8) {
            System.out.println("Kha");
        } else if (n > 5 && n < 6.5) {
            System.out.println("Trung binh");
        } else if (n <= 4) {
            System.out.println("Yeu");
        }
    }
}

}
