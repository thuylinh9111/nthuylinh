
package BaiTap1;
import java.util.*;
public class Student {
    String ID, Name, Major;
    float GPA;
    
    public void enterInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: "); ID = scanner.nextLine();
        System.out.print("Name: "); Name = scanner.nextLine();
        System.out.print("Major: "); Major = scanner.nextLine();
        System.out.print("GPA: "); GPA = scanner.nextFloat();
    }
    
    public void displayInfo() {
        System.out.println(ID + ": " + Name + ", " + Major + ", GPA: " + GPA);
    }
}