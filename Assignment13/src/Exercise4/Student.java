package exercise4;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {

    String major;

    public Student(String ID, String homeTown, Date dateOfBirth, String major) {
        super(ID, homeTown, dateOfBirth);
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major : " + major);
    }
}
