public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        if (savingsBalance >= 0.0) {
            this.savingsBalance = savingsBalance;
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newAnnualInterestRate) {
        if (newAnnualInterestRate >= 0.0) {
            annualInterestRate = newAnnualInterestRate;
        }
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
