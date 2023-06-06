package lessons10.homework1Polymorphism.math;

import lessons10.homework1Polymorphism.math.GeometricFigure;

public class Triangle implements GeometricFigure {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5*side*height;
    }
}
