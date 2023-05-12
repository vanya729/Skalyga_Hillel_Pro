package lessons4;

public class Drive {
    public static void main(String[] args) {

        double fuelPrice = Double.parseDouble(args[0]);

        Car car = new Car(50, 10, 6);
        final double DISTANCE_TO_KRYVE_OZERO  = 178.5;
        final double DISTANCE_TO_ZHASHKIV  = 152.8;
        final double DISTANCE_TO_KYIV  = 148.2;
        car.fillTheTankFull();

        double fuelToKryveOzero = car.toRefuelToOvercomeNKM(DISTANCE_TO_KRYVE_OZERO );
        car.fillTheTankFull();

        double fuelToZashkiv = car.toRefuelToOvercomeNKM(DISTANCE_TO_ZHASHKIV );
        car.fillTheTankFull();

        double fuelToKiev =car.theRemainingFuelOvercomingNkm(DISTANCE_TO_KYIV );
        double totalFuel = fuelToKryveOzero+fuelToZashkiv+DISTANCE_TO_KYIV ;
        double totalCost = totalFuel * fuelPrice;

        System.out.printf("It is necessary to add %.2f l of fuel for %.2f UAH%n", totalFuel, totalCost);
        System.out.printf("Remaining fuel in Kyiv: %.2f l", car.theRemainingFuelOvercomingNkm(DISTANCE_TO_KYIV ));
    }
}