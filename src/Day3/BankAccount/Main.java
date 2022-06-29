package Day3.BankAccount;

public class Main {

    //MAIN
    public static void main(String[] args) {

        BankAccount a = new BankAccount("Mike", 5000);
        BankAccount b = new BankAccount("John", 2000);


        //calling BankAccount class methods

        a.deposit(200);
        a.deposit(6000);

        a.withdraw(500);
        a.withdraw(10000);

        a.printAccountData();
        b.printAccountData();


        a.transferFunds(b, 5000);
        b.transferFunds(a, 3000);

    }
}
