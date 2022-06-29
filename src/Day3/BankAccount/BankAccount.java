package Day3.BankAccount;

import java.util.Scanner;

/*

3) create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another


    4) update your solution:
        * Encapsulate the balance property so it is private
        * add vo "withdraw" method, so it would be impossible to withdraw
          more money than exists in bank account. If there is an attempt to withdraw
          more money than exialidation tsts in bank account, output message:
            "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more
          money from the other account than it's balance.
                For example, if bank account A has 50 units and bank account B has 25 units
                and we try to transfer 30 units from B to A, then it should output:
                    "Transfer canceled. You are trying to transfer 30 units, but only 25 are available."
        * add a limit for depositing money. If the deposit is greater than 5000, then it should not
          do the deposit and output message:
              "Transaction canceled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account than possible

 */

public class BankAccount {

    //properties
    private double balance;
    private String name;

    //getter
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }


    //empty default CONSTRUCTOR
    public BankAccount() {
    }

    //CONSTRUCTOR with params for setting balance
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //METHODS

    //DEPOSIT METHOD which allows the user to increase the balance

    public void deposit(double amount) {
        this.balance = getBalance();

        //Scanner
//        Scanner sc = new Scanner(System.in); // creating new Scanner object
//        System.out.println("Please enter amount you would like to deposit into your account.");
//        amount = sc.nextDouble();

        if (amount <= 5000 && amount > 0) {
            balance += amount;
            System.out.println("You have successfully deposited " + amount + " USD into your account.");
            System.out.println("Your current account balance is " + balance + " USD.");
        } else {
            System.out.println("ERROR! Amount to deposit is not valid.");
        }
    }

    //WITHDRAW METHOD amount that will decrease the balance

    public void withdraw(double amount) {
        this.balance = balance;

        //Scanner
        Scanner sc = new Scanner(System.in); // creating new Scanner object
        System.out.println("Please enter amount you would like to withdraw from your account.");
        amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have successfully withdrawn " + amount + " USD from your account.");
            System.out.println("Your current account balance is " + balance + " USD.");
        } else {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + balance);
        }
    }

    //PRINT BALANCE METHOD

    public void printAccountData() {
        this.balance = getBalance();
        System.out.println("Your current account balance is " + balance + ".");
    }


    //METHOD TRANSFER FUNDS TO ANOTHER PERSONS ACCOUNT

    public void transferFunds(BankAccount name, double amountToTransfer) {
        if (balance >= amountToTransfer) {
            name.balance += amountToTransfer;
            balance -= amountToTransfer;
            System.out.println("You have transferred " + amountToTransfer + " USD. To the following account " + getName() + ".");
        } else {
            System.out.println("ERROR! Incorrect data entered or your current account balance is not sufficient for current transfer!");
        }
    }
}
