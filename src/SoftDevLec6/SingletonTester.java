package SoftDevLec6;

public class SingletonTester {

    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();
    }
}
