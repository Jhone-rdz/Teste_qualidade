public class EmployeeTest {

    public static void main(String[] args) {
        Employee meuemployee = new Employee("jose", "cesar", 1000.0);
        Employee novEmployee = new Employee("cesar", "carvalho", 1500.0);

        System.out.println(meuemployee.getSalarioMensal());
        System.out.println(novEmployee.getSalarioMensal());
    }

}
