public class Bank1Solution {

    public double startingBalance;
    public double currentBalance;

    public Bank1Solution(double v) {
        this.startingBalance = v;
    }

    public void depositMoney(double v) {
        this.currentBalance = this.currentBalance + v;
    }

}
