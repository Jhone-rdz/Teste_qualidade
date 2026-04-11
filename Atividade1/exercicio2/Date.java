public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
            this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
            this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
            this.ano = ano;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }

}
