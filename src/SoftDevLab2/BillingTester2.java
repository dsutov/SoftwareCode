package SoftDevLab2;

import java.util.ArrayList;

public class BillingTester2 {

    public static void main(String[] args) {
        Billing b1 = new Billing("Mary", 56546, 100);
        Billing b2 = new Billing("Claire", 89845, 150);
        Billing b3 = new Billing("Liam", 45132, 500);


        String name = "Mary";
        System.out.println("name is " + name);

        ArrayList<Billing> billings = new ArrayList<>();
        billings.add(b1);
        billings.add(b2);
        billings.add(b3);

        for(Billing b: billings){
           if(b.getName().equals(name)){
               b.printDetails();
           }
        }
    }
}
