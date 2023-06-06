package lessons10.homework1Polymorphism.math;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] geometricFigure = new GeometricFigure[3];

        geometricFigure[0] = new Circle(4);
        geometricFigure[1] = new Square(3);
        geometricFigure[2] = new Triangle(2,4);

        double sumArea=totalSumArea(geometricFigure);
        System.out.println("All area: "+sumArea);
        System.out.println();

    }

    public static double totalSumArea(GeometricFigure[] figures){
        double totalSum =0;
        for (GeometricFigure sum : figures){
            totalSum+=sum.getArea();
        }
        return totalSum;
    }
}
