package exercise3;

import java.util.ArrayList;
import java.util.Date;

public class Teacher extends Person {

    String department;

    public Teacher(String ID, String homeTown, Date dateOfBirth, String department) {
        super(ID, homeTown, dateOfBirth);
        this.department = department;
    }

    @Override

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department : " + department);
    }
}
