package Atividade2.exercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateIPTest {

    @Test
    void shouldValidateCorrectIps() {
        ValidateIP validator = new ValidateIP();

        assertTrue(validator.validate("192.168.1.1"));
        assertTrue(validator.validate("255.255.255.255"));
        assertTrue(validator.validate("0.0.0.0"));
    }

    @Test
    void shouldRejectInvalidIps() {
        ValidateIP validator = new ValidateIP();

        assertFalse(validator.validate("256.1.1.1"));
        assertFalse(validator.validate("192.168.1"));
        assertFalse(validator.validate("192.168.1.a"));
        assertFalse(validator.validate("01.1.1.1"));
    }
}
