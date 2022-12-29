public class Bank2Solution {

    public double startingBalance;
    public double currentBalance;

    public Bank2Solution(double v) {

        this.startingBalance = v;
    }

    public void depositMoney(double v) {

        this.currentBalance = this.currentBalance + v;
    }

}
