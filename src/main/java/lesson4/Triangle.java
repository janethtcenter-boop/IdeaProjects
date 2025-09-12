package lesson4;

public class Triangle implements Geometry {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    @Override
    public double calculatePerimeter() {

        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() /2 ;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
