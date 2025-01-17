
package baitapvenha;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int n = array.length;
        for (int i=0;i<n;i++){
            System.out.print("Number "+(i+1)+": ");
            array[i]=scanner.nextInt();
        }
        for (int i=0;i<n-1;i++){
           for(int j=0;j<n-1-i;j++){
              if(array[j]>array[j+1]){
                  int temp=array[j];
                  array[j]=array[j+1];
                  array[j+1]=temp;
              } 
           }
        }
        System.out.println("Mang tang dan la: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
