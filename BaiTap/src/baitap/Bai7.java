
package baitap;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        System.out.print("Cac so trich xuat tu chuoi: ");
        String number = ""; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 

            if (ch >= '0' && ch <= '9') {
                number += ch; 
            } else {
                
                if (!number.equals("")) {
                    System.out.print(number + " ");
                    number = ""; 
                }
            }
        }

       
        if (!number.equals("")) {
            System.out.print(number);
        }

        scanner.close();
    }
    
}
