package homework_cmu_cs303wis;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex10 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("2");
        names.add("1");
        names.add("1");
        names.add("3");
        names.add("1");

        System.out.println("Initial list: " + names);

        HashSet<String> uniqueNames = new HashSet<>(names);
        names = new ArrayList<>(uniqueNames);

        System.out.println("List after removing duplicates: " + names);
    }

}
