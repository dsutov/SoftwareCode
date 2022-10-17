package SoftDevLab1;

public class Customer {

    private String name;
    private String address;
    private int phone_number;
    private String plan;


    public Customer(int phone_number){
        this.phone_number = phone_number;
    }

    public Customer(String name, int phone_number){
        this.name = name;
        this.phone_number = phone_number;
    }

    public Customer(String name, String address, int phone_number, String plan){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.plan = plan;
    }

    public Customer(String name, int phone_number, String plan){
        this.name = name;
        this.phone_number = phone_number;
        this.plan = plan;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getPhone_number(){
        return this.phone_number;
    }

    public void setPhone_number(int phone_number){
        this.phone_number = phone_number;
    }

    public String getPlan(){
        return this.plan;
    }

    public void setPlan(String plan){
        this.plan = plan;
    }



    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phone_number);
        System.out.println("Plan: " + plan);
        System.out.println("--------------------------------------------");
    }
}







