package AtividadeValidacaoDeSenha;

public class ValidarSenha {
    public String validarSenha(String senha) {
        if (senha.length() < 6) {
            return "A Senha é Inválida";
        }
        if (!senha.matches(".*\\d.*")) {
            return "A Senha é Inválida";
        }
        if (!senha.matches(".*[A-Z].*")) {
            return "A Senha é Inválida"; 
        }
        if (!senha.matches(".*[a-z].*")) {
            return "A Senha é Inválida"; 
        }
        if (!senha.matches(".*[!@#$%^&*()+-].*")) {
            return "A Senha é Inválida";
        }
        return "A Senha é válida.";
    }
}
