package BaiTap2;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();
        dog.id = "D001";
        dog.source = "Breeder";
        dog.dateOfBirth = Date.from(LocalDate.of(2022, 5, 20).atStartOfDay(ZoneId.systemDefault()).toInstant());

        dog.color = "Brown";
        dog.breed = "Golden Retriever";

        Cat cat = new Cat();
        cat.id = "C001";
        cat.source = "Adoption";
        cat.dateOfBirth = Date.from(LocalDate.of(2022, 5, 20).atStartOfDay(ZoneId.systemDefault()).toInstant());

        cat.color = "Black";

        AnimalList animalList = new AnimalList();
        animalList.addAnimal(dog);
        animalList.addAnimal(cat);

        animalList.displayAll();
    }
}
