package AtividadeValidacaoDeSenha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidarSenhaTest {

    @Test
    void shouldAcceptValidPassword() {
        ValidarSenha validarSenha = new ValidarSenha();

        assertEquals("A Senha é válida.", validarSenha.validarSenha("Abcdef1!"));
    }

    @Test
    void shouldRejectPasswordTooShort() {
        ValidarSenha validarSenha = new ValidarSenha();

        assertEquals("A Senha é Inválida", validarSenha.validarSenha("Ab1!"));
    }

    @Test
    void shouldRejectPasswordWithoutDigit() {
        ValidarSenha validarSenha = new ValidarSenha();

        assertEquals("A Senha é Inválida", validarSenha.validarSenha("Abcdef!"));
    }

    @Test
    void shouldRejectPasswordWithoutUppercaseLetter() {
        ValidarSenha validarSenha = new ValidarSenha();

        assertEquals("A Senha é Inválida", validarSenha.validarSenha("abcdef1!"));
    }

    @Test
    void shouldRejectPasswordWithoutLowercaseLetter() {
        ValidarSenha validarSenha = new ValidarSenha();

        assertEquals("A Senha é Inválida", validarSenha.validarSenha("ABCDEF1!"));
    }

    @Test
    void shouldRejectPasswordWithoutSpecialCharacter() {
        ValidarSenha validarSenha = new ValidarSenha();

        assertEquals("A Senha é Inválida", validarSenha.validarSenha("Abcdef12"));
    }
}
