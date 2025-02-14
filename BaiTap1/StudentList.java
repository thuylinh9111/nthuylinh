
package BaiTap1;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {
    ArrayList<Student> list = new ArrayList<>();
    
    public void addStudents(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.enterInfo();
            list.add(student);
        }
    }
    
    public Student findById(String id) {
        for (Student student : list) if (student.ID.equals(id)) return student;
        return null;
    }
    
    public boolean deleteById(String id) {
        return list.removeIf(student -> student.ID.equals(id));
    }
    
    public boolean editById(String id) {
        Student student = findById(id);
        if (student != null) { student.enterInfo(); return true; }
        return false;
    }
    
    public void displayAll() {
        for (Student student : list) student.displayInfo();
    }
}