package BaiTap2;

public class Dog extends Animal {

    String breed;

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
