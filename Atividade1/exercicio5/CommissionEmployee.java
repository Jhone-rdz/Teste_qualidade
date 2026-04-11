public class CommissionEmployee extends Employee {
    private double vendasBrutas;
    private double taxaComissao;

    public CommissionEmployee(String primeiroNome, String ultimoNome, String cpf, double vendasBrutas, double taxaComissao) {
        super(primeiroNome, ultimoNome, cpf);
        setVendasBrutas(vendasBrutas);
        setTaxaComissao(taxaComissao);
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        if (vendasBrutas >= 0.0) {
            this.vendasBrutas = vendasBrutas;
        }
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        if (taxaComissao >= 0.0 && taxaComissao <= 1.0) {
            this.taxaComissao = taxaComissao;
        }
    }

    @Override
    public double earnings() {
        return vendasBrutas * taxaComissao;
    }

    @Override
    public String toString() {
        return String.format(
            "CommissionEmployee [%s, vendasBrutas: %.2f, taxaComissao: %.2f]",
            super.toString(),
            vendasBrutas,
            taxaComissao
        );
    }
}
