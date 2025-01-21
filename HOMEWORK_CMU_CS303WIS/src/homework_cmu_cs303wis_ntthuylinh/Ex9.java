package homework_cmu_cs303wis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Number list: " + numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}
