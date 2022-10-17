package SoftDevLab1;

public class BankTest {

    public static void main(String[] args) {
        Bank p1 = new Bank("John", 1001);
        Bank p2 = new Bank("Dave", 1002, 100);


        p1.getBalance();
        p1.lodgeMoney(250);
        p1.getBalance();
        p1.withdraw(20);
        p1.getBalance();


        System.out.println("----------------------------");


        p2.getBalance();
        p2.lodgeMoney(55);
        p2.getBalance();
        p2.withdraw(37);
        p2.getBalance();
        p2.withdraw(0);

    }
}
