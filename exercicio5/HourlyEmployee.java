public class HourlyEmployee extends Employee {
    private double valorHora;
    private double horasTrabalhadas;

    public HourlyEmployee(String primeiroNome, String ultimoNome, String cpf, double valorHora, double horasTrabalhadas) {
        super(primeiroNome, ultimoNome, cpf);
        setValorHora(valorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora >= 0.0) {
            this.valorHora = valorHora;
        }
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if (horasTrabalhadas >= 0.0) {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    @Override
    public double earnings() {
        if (horasTrabalhadas <= 40.0) {
            return horasTrabalhadas * valorHora;
        }
        double horasExtras = horasTrabalhadas - 40.0;
        return (40.0 * valorHora) + (horasExtras * valorHora * 1.5);
    }

    @Override
    public String toString() {
        return String.format(
            "HourlyEmployee [%s, valorHora: %.2f, horasTrabalhadas: %.2f]",
            super.toString(),
            valorHora,
            horasTrabalhadas
        );
    }
}
