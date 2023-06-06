package lessons10.homework1Polymorphism.math;

import lessons10.homework1Polymorphism.math.GeometricFigure;

public class Square implements GeometricFigure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
