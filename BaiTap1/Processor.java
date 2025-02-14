package BaiTap1;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();

        while (true) {
            System.out.print("1. Add Students\n2.");
            System.out.print("Display All\n3.");
            System.out.print("Find by ID\n4.");
            System.out.print("Delete by ID\n5.");
            System.out.print("Edit by ID\n6.");
            System.out.println("Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of students: ");
                    studentList.addStudents(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 2:
                    studentList.displayAll();
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    Student student = studentList.findById(scanner.nextLine());
                    if (student != null) {
                        student.displayInfo();
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    if (studentList.deleteById(scanner.nextLine())) {
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter student ID to edit: ");
                    if (studentList.editById(scanner.nextLine())) {
                        System.out.print("Edited.");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.print("Invalid option.");
            }
        }
    }
}
