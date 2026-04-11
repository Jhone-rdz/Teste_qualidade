public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount conta1 = new SavingsAccount(2000.00);
        SavingsAccount conta2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Taxa anual: 4%");
        for (int mes = 1; mes <= 12; mes++) {
            conta1.calculateMonthlyInterest();
            conta2.calculateMonthlyInterest();
            System.out.printf("Mes %02d - conta1: %.2f | conta2: %.2f%n", mes, conta1.getSavingsBalance(), conta2.getSavingsBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nTaxa anual: 5%");
        for (int mes = 1; mes <= 12; mes++) {
            conta1.calculateMonthlyInterest();
            conta2.calculateMonthlyInterest();
            System.out.printf("Mes %02d - conta1: %.2f | conta2: %.2f%n", mes, conta1.getSavingsBalance(), conta2.getSavingsBalance());
        }
    }
}
