package baitaparraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of value to display: ");
        int n = scanner.nextInt();
        ArrayList<Double> value = new ArrayList<>();
        value.add(12.67);
        value.add(5.99);
        value.add(9.19);
        value.add(15.3);
        System.out.println("Values in the list:");
        for (int i = 0; i < n && i < value.size(); i++) {
            System.out.println(value.get(i));
        }
    }

}
