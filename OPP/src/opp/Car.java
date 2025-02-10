 package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter details for myCar" + i);
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            cars.add(new Car(model, year));
        }

        System.out.println("All Cars:");
        for (Car car : cars) {
            car.displayDetails();
        }
    }

}
    }
    
}
