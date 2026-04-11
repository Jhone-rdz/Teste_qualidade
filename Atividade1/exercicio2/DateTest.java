public class DateTest {
    public static void main(String[] args) {
        Date data1 = new Date(28, 3, 2026);
        Date data2 = new Date(31, 2, 2024);

        System.out.print("Data 1: ");
        data1.displayDate();

        System.out.print("Data 2 (invalida, valores padrao): ");
        data2.displayDate();

        data1.setDia(30);
        data1.setMes(4);
        data1.setAno(2027);

        System.out.print("Data 1 apos setters: ");
        data1.displayDate();
    }
}
