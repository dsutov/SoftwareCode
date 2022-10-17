package SoftDevLab5;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("I am a dog - Woof");
    }

    @Override
    public void canFly() {
        System.out.println("I am a dog - I cannot fly");
    }


}
