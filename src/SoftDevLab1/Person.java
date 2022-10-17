package SoftDevLab1;

public class Person {

    private String name;
    private String address;
    private int phone_number;

    public Person() {
        this.name = null;
        this.address = null;
        this.phone_number = 0;
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int phone_number){
        this.name = name;
        this.phone_number = phone_number;
    }

    public Person(String name, String address, int phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }


    public void printDetails(){

    }


}
