package SoftDevLab5;

public class Bird extends Animal{
    @Override
    public void speak() {
        System.out.println("I am a bird - tweet tweet");
    }

    @Override
    public void canFly() {
        System.out.println("I can fly!");
    }
}
