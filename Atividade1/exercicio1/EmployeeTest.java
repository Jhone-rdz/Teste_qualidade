public class EmployeeTest {

    public static void main(String[] args) {
        Employee meuemployee = new Employee("jose", "cesar", 1000.0);
        Employee novEmployee = new Employee("cesar", "carvalho", 1500.0);

        double salarioAnual1 = meuemployee.getSalarioMensal() * 12;
        double salarioAnual2 = novEmployee.getSalarioMensal() * 12;

        System.out.println("Salario anual inicial de " + meuemployee.getPrimeiroNome() + ": " + salarioAnual1);
        System.out.println("Salario anual inicial de " + novEmployee.getPrimeiroNome() + ": " + salarioAnual2);

        meuemployee.setSalarioMensal(meuemployee.getSalarioMensal() * 1.10);
        novEmployee.setSalarioMensal(novEmployee.getSalarioMensal() * 1.10);

        salarioAnual1 = meuemployee.getSalarioMensal() * 12;
        salarioAnual2 = novEmployee.getSalarioMensal() * 12;

        System.out.println("Salario anual com aumento de 10% de " + meuemployee.getPrimeiroNome() + ": " + salarioAnual1);
        System.out.println("Salario anual com aumento de 10% de " + novEmployee.getPrimeiroNome() + ": " + salarioAnual2);
    }

}
