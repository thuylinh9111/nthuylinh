package exercise4;

import java.util.ArrayList;
import java.util.Date;

public class Person {

    String ID;
    String homeTown;
    Date dateOfBirth;

    public Person(String ID, String homeTown, Date dateOfBirth) {
        this.ID = ID;
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("ID : " + ID);
        System.out.println("Hometown : " + homeTown);
        System.out.println("Date : " + dateOfBirth);

    }

    public boolean addPerson() {
        return true;
    }

    public boolean editPerson() {
        return true;
    }
}
