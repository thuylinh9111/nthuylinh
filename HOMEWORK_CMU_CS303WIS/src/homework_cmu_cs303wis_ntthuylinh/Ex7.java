package homework_cmu_cs303wis;

import java.util.ArrayList;
import java.util.Collections;

public class Ex7 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Initial list: " + numbers);
        Collections.reverse(numbers);
        System.out.println("List after reversal: " + numbers);
    }
}
