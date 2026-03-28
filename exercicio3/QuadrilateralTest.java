public class QuadrilateralTest {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(
            new Point(0, 0),
            new Point(6, 0),
            new Point(4, 3),
            new Point(1, 3)
        );

        Parallelogram parallelogram = new Parallelogram(
            new Point(0, 0),
            new Point(5, 0),
            new Point(7, 3),
            new Point(2, 3)
        );

        Rectangle rectangle = new Rectangle(
            new Point(0, 0),
            new Point(4, 0),
            new Point(4, 3),
            new Point(0, 3)
        );

        Square square = new Square(
            new Point(0, 0),
            new Point(2, 0),
            new Point(2, 2),
            new Point(0, 2)
        );

        System.out.printf("Area do Trapezoid: %.2f%n", trapezoid.getArea());
        System.out.printf("Area do Parallelogram: %.2f%n", parallelogram.getArea());
        System.out.printf("Area do Rectangle: %.2f%n", rectangle.getArea());
        System.out.printf("Area do Square: %.2f%n", square.getArea());
    }
}
