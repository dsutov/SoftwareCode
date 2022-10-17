package SoftDevLab1;

public class MainCustomer {

    public static void main(String[] args) {
        Customer c1 = new Customer("John",325);
        Customer c2 = new Customer("Mary","Dublin", 767, "Prepay");
        Customer c3 = new Customer(221);
        Customer c4 = new Customer("Dave",970, "Bill");

        c1.printDetails();
        c2.printDetails();
        System.out.println("C3 details: " + c3.getName() + " " + c3.getAddress() + " " + c3.getPhone_number() + " " + c3.getPlan());
        System.out.println("--------------------------------------------");
        System.out.println("C4 details: " + c4.getName() + " " + c4.getAddress() + " " + c4.getPhone_number() + " " + c4.getPlan());


    }
}
