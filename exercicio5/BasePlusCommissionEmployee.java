public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double salarioBase;

    public BasePlusCommissionEmployee(
        String primeiroNome,
        String ultimoNome,
        String cpf,
        double vendasBrutas,
        double taxaComissao,
        double salarioBase
    ) {
        super(primeiroNome, ultimoNome, cpf, vendasBrutas, taxaComissao);
        setSalarioBase(salarioBase);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0.0) {
            this.salarioBase = salarioBase;
        }
    }

    @Override
    public double earnings() {
        return getSalarioBase() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("BasePlusCommissionEmployee [%s, salarioBase: %.2f]", super.toString(), salarioBase);
    }
}
