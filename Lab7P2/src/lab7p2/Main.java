//FOR THE REMAINING PROBLEMS, B AND C

package lab7p2;

import java.util.ArrayList;
import java.util.Scanner;

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

class CheckingAccount extends Account
{
    private double overdraftLimit;
    CheckingAccount()
    {
        super();
        this.overdraftLimit = 0.0f;
    }

    CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit)
    {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() { return this.overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }
}

class SavingsAccount extends Account
{
    private String cardNumber;
    SavingsAccount()
    {
        super();
        this.cardNumber = "";
    }

    SavingsAccount(int id, double balance, double annualInterestRate, String cardNumber)
    {
        super(id, balance, annualInterestRate);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() { return this.cardNumber; }
    public void setCardNumber()
    {
        this.cardNumber = cardNumber;
    }

    public double getCreditBalance() { return 3 * this.getBalance(); }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountID;
        double balance;
        double annualInterestRate;
        double overdraftLimit;
        String cardNumber;
        ArrayList<Account> accounts = new ArrayList<Account>();

        for(int i = 0; i < 2; ++i)
        {
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Savings Account");
            if(input.nextInt() == 1)//create checking account
            {
                System.out.print("Enter Account ID: ");
                accountID = input.nextInt();
                System.out.print("Enter Current Balance: ");
                balance = input.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                annualInterestRate = input.nextDouble();
                System.out.print("Enter Overdraft Limit: ");
                overdraftLimit = input.nextDouble();
                accounts.add(new CheckingAccount(accountID, balance, annualInterestRate, overdraftLimit));
            }
            else //create savings account
            {
                System.out.print("Enter Account ID: ");
                accountID = input.nextInt();
                System.out.print("Enter Current Balance: ");
                balance = input.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                annualInterestRate = input.nextDouble();
                input.nextLine();
                System.out.print("Enter Card Number: ");
                cardNumber = input.nextLine();
                accounts.add(new SavingsAccount(accountID, balance, annualInterestRate, cardNumber));
            }
        }
        System.out.println("");
        for(Account x : accounts)
        {
            if(x instanceof CheckingAccount) //if x is a Checking Account
            {
                System.out.println("This is a Checking Account");
                System.out.println("Account ID: " + x.getID());
                System.out.println("Current Balance: " + x.getBalance());
                System.out.println("Annual Interest Rate: " + x.getAnnualInterestRate());
                System.out.println("Monthly Interest Amount: " + x.getMonthlyInterestAmount());
                System.out.println("Overdraft Limit: " + ((CheckingAccount) x).getOverdraftLimit());

            }
            else if(x instanceof SavingsAccount) //if x is a Saving Account
            {
                System.out.println("This is a Savings Account");
                System.out.println("Account ID: " + x.getID());
                System.out.println("Current Balance: " + x.getBalance());
                System.out.println("Annual Interest Rate: " + x.getAnnualInterestRate());
                System.out.println("Monthly Interest Amount: " + x.getMonthlyInterestAmount());
                System.out.println("Credit Card Number: " + ((SavingsAccount)x).getCardNumber());
                System.out.println("Credit Balance: " + ((SavingsAccount)x).getCreditBalance());
            }
            System.out.println();
        }
    }
}
