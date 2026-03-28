public class SalariedEmployee extends Employee {
    private double salarioSemanal;

    public SalariedEmployee(String primeiroNome, String ultimoNome, String cpf, double salarioSemanal) {
        super(primeiroNome, ultimoNome, cpf);
        setSalarioSemanal(salarioSemanal);
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal >= 0.0) {
            this.salarioSemanal = salarioSemanal;
        }
    }

    @Override
    public double earnings() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee [%s, salarioSemanal: %.2f]", super.toString(), salarioSemanal);
    }
}
