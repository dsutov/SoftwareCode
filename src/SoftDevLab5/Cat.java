package SoftDevLab5;

public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("I am a cat - Meow");
    }

    @Override
    public void canFly() {
        System.out.println("Cats do not fly");
    }
}
