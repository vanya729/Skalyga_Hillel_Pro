package lessons10.homework1Polymorphism.math;

import lessons10.homework1Polymorphism.math.GeometricFigure;

public class Circle implements GeometricFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
