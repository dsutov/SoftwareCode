package SoftDevLab2;

public class BillingTester {

    public static void main(String[] args) {

        Billing b1 = new Billing("John", 456789, 50);
        System.out.println("John your balance is " + b1.getBalance());
        System.out.println();
        b1.newBill(100);
        System.out.println();
        b1.payment(10);
        System.out.println();
        b1.newBill(100);
        System.out.println();
        b1.payment(500);
        System.out.println();
        b1.newBill(-50);
        System.out.println();
        b1.payment(-100);
    }

}
