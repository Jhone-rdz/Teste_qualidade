public class Quadrilateral {
    protected final Point a;
    protected final Point b;
    protected final Point c;
    protected final Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getArea() {
        double soma1 = a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * d.getY() + d.getX() * a.getY();
        double soma2 = a.getY() * b.getX() + b.getY() * c.getX() + c.getY() * d.getX() + d.getY() * a.getX();
        return Math.abs(soma1 - soma2) / 2.0;
    }
}
