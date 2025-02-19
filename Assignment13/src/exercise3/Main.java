package exercise3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personlist = new PersonList();
        System.out.print("ID : ");
        String studentID = scanner.nextLine();
        System.out.print("HomeTown : ");
        String studentHomeTown = scanner.nextLine();
        System.out.print("Date of birth(dd/MM/yyyy) : ");
        String dateOfBirthString = scanner.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid");
        }
        System.out.print("Major : ");
        String studentMajor = scanner.nextLine();
        Student student = new Student(studentID, studentHomeTown, new Date(dateOfBirthString), studentMajor);
        personlist.addPerson(student);
        System.out.print("Teacher ID : ");
        String teacherID = scanner.nextLine();
        System.out.print("Teacher HomeTown : ");
        String teacherHomeTown = scanner.nextLine();
        System.out.print("Date of birth(dd/MM/yyyy) : ");
        String teacherDate = scanner.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid");
        }
        System.out.print("Teacher Department : ");
        String teacherDepartment = scanner.nextLine();
        personlist.addPerson(new Teacher(teacherID, teacherHomeTown, new Date(dateOfBirthString), teacherDepartment));
        personlist.displayAll();
    }
}
