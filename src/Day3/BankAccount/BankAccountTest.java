package Day3.BankAccount;

import org.junit.jupiter.api.DisplayName;

import static com.sun.tools.doclint.Entity.delta;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account;

    @org.junit.jupiter.api.Test
    @DisplayName("Check Deposit")
    void deposit() {
        account.deposit(500);
        assertEquals(account.deposit(500));
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        account.withdraw(500);
        assertEquals(account.printAccountData(),500);
    }
}