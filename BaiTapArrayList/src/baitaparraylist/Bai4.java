package baitaparraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();
        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            String city = scanner.nextLine();
            cities.add(city);
        }
        boolean containsLondon = cities.contains("Da Nang");
        System.out.println("Does the list contain 'Da Nang'? " + containsLondon);
    }

}
