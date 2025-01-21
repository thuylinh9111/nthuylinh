package homework_cmu_cs303wis;

import java.util.Random;
import java.util.ArrayList;

public class Ex6 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(50) + 1);
        }
        int oddCount = 0, evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number list: " + numbers);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
