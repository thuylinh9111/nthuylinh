
package BaiTap2;

public class Cat extends Animal {
    String color;

    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

