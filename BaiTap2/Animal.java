package BaiTap2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Animal {

    String id;
    String source;
    Date dateOfBirth;
    String color;

    public void makeSound() {
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Source: " + source);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Color: " + color);
    }
}
