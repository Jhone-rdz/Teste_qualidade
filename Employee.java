public class Employee {
    private String primeiro_nome;
    private String ultimo_nome;
    private Double salario_mensal;

    public Employee(String primeiro_nome, String ultimo_nome, Double salario_mensal) {
        this.primeiro_nome = primeiro_nome;
        this.ultimo_nome = ultimo_nome;
        if (salario_mensal > 0.0) {
            this.salario_mensal = salario_mensal;
        } else {
            System.out.println("Salario negativo");
        }
    }

    public void setPrimeiroNome(String novoPrimeiroNome){
        this.primeiro_nome = novoPrimeiroNome;
    }

    public void setUltimoNome(String novoUltimoNome){
        this.ultimo_nome = novoUltimoNome;
    }

    public void setSalarioMensal(Double novoSalarioMensal){
        if (salario_mensal > 0.0){
            this.salario_mensal = novoSalarioMensal;
        } else {
            System.out.println("Salario negativo");
        }
    }

    public String getPrimeiroNome(){
        return primeiro_nome;
    }
    public String getUltimoNome(){
        return ultimo_nome;
    }
    public Double getSalarioMensal(){
        return salario_mensal;
    }



    

}