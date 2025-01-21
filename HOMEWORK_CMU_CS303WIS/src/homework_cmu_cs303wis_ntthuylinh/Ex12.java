package homework_cmu_cs303wis;

import java.util.ArrayList;
import java.util.Random;

public class Ex12 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100) + 1;
            numbers.add(num);
            sum += num;
        }

        System.out.println("Number list: " + numbers);
        System.out.println("Sum: " + sum);
    }

}
