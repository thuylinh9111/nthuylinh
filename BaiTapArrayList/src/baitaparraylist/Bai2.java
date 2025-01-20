package baitaparraylist;

import java.util.ArrayList;

public class Bai2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Purple");
        colors.add("Orange");
        System.out.println("Original list: " + colors);
        colors.set(2, "Brown");
        System.out.println("Updated list: " + colors);
    }
}
