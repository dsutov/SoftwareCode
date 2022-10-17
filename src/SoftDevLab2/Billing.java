package SoftDevLab2;

public class Billing {

    private String name;
    private int account_number;
    private double balance;


    public Billing(){
        this.name = null;
        this.account_number = 0;
        this.balance = 0;
    }

    public Billing(String name, int account_number, double balance){
        this.name = name;
        this.account_number = account_number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void newBill(double lodgement){
        System.out.println(lodgement + " is added to your balance.");
        if(lodgement <= 0 )
        {
            System.out.println("Error -  cannot charge 0 or less than 0");
        } else
        {
            this.balance = this.balance + lodgement;
        }

        System.out.println("new bill is: " + this.balance);
    }

    public void payment(double payment){
        System.out.println("You are paying: " + payment + " off your balance");
        if (payment <= 0 )
        {
            System.out.println("Error - cannot pay 0 or less than 0");
            System.out.println("new bill is: " + this.balance);

        }else if (payment > this.balance)
        {
            System.out.println("Error - cannot allow account to go to credit");
            System.out.println("new bill is: " + this.balance);

        } else {
            this.balance = this.balance - payment;
            System.out.println("new bill is: " + this.balance);
        }
    }

    public void printDetails(){
        System.out.print("Name:" + this.name + ", "+ "Account Number:" + this.account_number + ", " + "Balance: " + this.balance);
        System.out.println("----------------------------");
    }
}
