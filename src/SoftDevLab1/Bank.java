package SoftDevLab1;

public class Bank {

    private String name;
    private int account_number;
    private double balance;

    public Bank() {
        this.name = null;
        this.account_number = 0;
        this.balance = 0;
    }

    public Bank(String name, int account_number) {
        this.name = name;
        this.account_number = account_number;
    }

    public Bank(String name, int account_number, double balance) {
        this.name = name;
        this.account_number = account_number;
        this.balance = balance;
    }

    // lodge money
    public void lodgeMoney(double lodgement){
        if(lodgement <= 0){
            System.out.println("Error - cant lodge less than 0.");
        } else {
            System.out.println("Lodging: " + lodgement);
            this.balance = this.balance + lodgement;
        }
    }

    // get balance
    public void getBalance() {
        System.out.println("Balance:" + this.balance);
    }

    // withdraw money
    public void withdraw(double withdraw_amt){

        if(withdraw_amt > this.balance){
            System.out.println("Error - insufficient funds");
        }else if(withdraw_amt <= 0) {
            System.out.println("Please enter a valid amount");
        } else {
            System.out.println("Withdrawing: " + withdraw_amt);
            this.balance = this.balance - withdraw_amt;
        }
    }

}
