package SoftDevLab5;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.speak();
        dog.canFly();
        System.out.println();

        Animal cat = new Cat();
        cat.speak();
        cat.canFly();
        System.out.println();

        Animal bird = new Bird();
        bird.speak();
        bird.canFly();
    }
}
