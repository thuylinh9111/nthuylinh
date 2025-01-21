package homework_cmu_cs303wis;

import java.util.ArrayList;

public class Ex8 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        ArrayList<String> copiedFruits = new ArrayList<>(fruits);
        System.out.println("Initial list: " + fruits);
        System.out.println("List copied: " + copiedFruits);
    }
}
