package homework_cmu_cs303wis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex11 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Number list: " + numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}
