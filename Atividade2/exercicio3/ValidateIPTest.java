package Atividade2.exercicio3;

public class ValidateIPTest {
    public static void main(String[] args) {
        ValidateIP validator = new ValidateIP();
        System.out.println(validator.validate("192.168.1.1"));
        System.out.println(validator.validate("255.255.255.255"));
        System.out.println(validator.validate("256.1.1.1"));
        System.out.println(validator.validate("192.168.1"));
    }
}
