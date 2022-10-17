package SoftDevLec6;

public class SingletonExample
{

    private static SingletonExample theSingleInstance = null;

    private SingletonExample() {
        System.out.println("Constructor for singleton has been called");
    }

    public static SingletonExample getInstance() {
        if(theSingleInstance == null) {
            System.out.println("The singleton does not exist so it will be created");
            theSingleInstance = new SingletonExample();
            return theSingleInstance;
        } else {
            System.out.println("The singleton does already exist");
            return theSingleInstance;
        }
    }
}
