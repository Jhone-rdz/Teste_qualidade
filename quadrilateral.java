public abstract class quadrilateral {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public quadrilateral(Point A, Point B, Point C, Point D){
        if ( A == B || A == C)
            throw new IllegalArgumentException("Quadrilátero possui vértices coincidentes");
        
            this.A = A;
            this.B = B;
            this.C = C;
            this.D = D;
    }
    
}
