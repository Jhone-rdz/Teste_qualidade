public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] funcionarios = new Employee[] {
            new SalariedEmployee("Ana", "Silva", "111.111.111-11", 1200.00),
            new HourlyEmployee("Bruno", "Souza", "222.222.222-22", 50.00, 45.0),
            new CommissionEmployee("Carla", "Lima", "333.333.333-33", 5000.00, 0.10),
            new BasePlusCommissionEmployee("Diego", "Costa", "444.444.444-44", 5000.00, 0.10, 800.00)
        };

        for (Employee funcionario : funcionarios) {
            System.out.println(funcionario.toString());
            System.out.printf("ganhos semanais: %.2f%n%n", funcionario.earnings());
        }
    }
}
