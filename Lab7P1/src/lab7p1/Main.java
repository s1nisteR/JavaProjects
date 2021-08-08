package lab7p1;

class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;

    Account()
    {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
    }

    Account(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //getters
    public int getID() { return this.id; }
    public double getBalance() { return this.balance; }
    public double getAnnualInterestRate() { return this.annualInterestRate; }

    //setters
    public void setID(int id) { this.id = id; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    public double getMonthlyInterestRate()
    {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterestAmount()
    {
        return this.balance * (this.getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount)
    {
        this.balance -= amount;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

}



public class Main {

    public static void main(String[] args) {
	    Account first = new Account(1122, 20000, 4.5);
	    first.withdraw(2500);
	    first.deposit(3000);
        System.out.println("ID: " + first.getID());
        System.out.println("Balance: " + first.getBalance());
        System.out.println("Monthly Interest Amount: " + first.getMonthlyInterestAmount());
    }
}
