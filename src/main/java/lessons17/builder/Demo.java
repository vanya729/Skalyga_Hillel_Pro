package lessons17.builder;

import lessons17.builder.builders.CarBuilder;
import lessons17.builder.builders.CarManualBuilder;
import lessons17.builder.cars.Car;
import lessons17.builder.cars.Manual;
import lessons17.builder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}