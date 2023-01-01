import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BankAccountTests {

    // Test 1
//    @Test
//    public void testOpenBankAccount() {
//        Bank1 myBank1 = new Bank1(100.00);
//        double startingBalance = myBank1.startingBalance;
//        assertEquals(100.00, startingBalance, 0.0);
//    }

    // Test 2
//    @Test
//    public void testSingleDeposit() {
//        Bank1 myBank1 = new Bank1(0.00);
//        double startingBalance = myBank1.startingBalance;
//
//        myBank1.depositMoney(50.00);
//        assertEquals(50.00, myBank1.currentBalance, 0.0);
//    }

    // Test 3
//    @Test
//    public void testMultipleDeposits() {
//        Bank1 myBank1 = new Bank1(0.00);
//
//        myBank1.depositMoney(50.00);
//        myBank1.depositMoney(150.00);
//
//        assertEquals(200.00, myBank1.currentBalance, 0.0);
//    }

    // Test 4
//    @Test
//    public void testMultipleAccounts() {
//        Bank1 myBank1 = new Bank1(0.00);
//        myBank1.depositMoney(500.00);
//        myBank1.depositMoney(1500.00);
//
//        Bank2 myBank2 = new Bank2(1000.00);
//        myBank2.depositMoney(5000.00);
//
//        assertEquals(2000.00, myBank1.currentBalance, 0.0);
//        assertEquals(6000.00, myBank2.currentBalance, 0.0);
//    }

    // Test 5
//    @Test
//    public void testSpendMoney() {
//        Bank1 myBank1 = new Bank1(2000.00);
//        myBank1.depositMoney(500.00);
//        myBank1.spendMoney(1500.00);
//
//        assertEquals(1000.00, myBank1.currentBalance, 0.0);
//    }

    // Test 6
//    @Test
//    public void testSpendMoneyFromMultipleAccounts() {
//        Bank1 myBank1 = new Bank1(2000.00);
//        myBank1.depositMoney(500.00);
//        myBank1.spendMoney(1500.00);
//
//        Bank2 myBank2 = new Bank2(1000.00);
//        myBank2.spendMoney(5000.00);
//
//        assertEquals(-4000.00, myBank2.currentBalance, 0.0);
//    }

    // Test 7
//    @Test
//    public void testRecordDepositsAndWithdrawals() {
//        Bank1 myBank1 = new Bank1(200.00);
//        ArrayList<String> expectedValues = new ArrayList<String>();
//        expectedValues.add("Opening Balance 200.00");
//
//        assertEquals(expectedValues, myBank1.transactions);
//
//        myBank1.depositMoney(300.00);
//        expectedValues.add("Deposit 300.00");
//        assertEquals(expectedValues, myBank1.transactions);
//
//        myBank1.spendMoney(1500.00);
//        expectedValues.add("Withdrawal 1500.00");
//        assertEquals(expectedValues, myBank1.transactions);
//    }

}
