package lessons4;

public class Drive {
    public static void main(String[] args) {

        double fuelPrice = Double.parseDouble(args[0]); // ціна палива як аргумент 40

        Car car = new Car(50, 10, 6);
        double distanceToKryveOzero = 178.5; // кілометрів до Кривого Озера
        double distanceToZhashkiv = 152.8; // кілометрів до Жашкова
        double distanceToKyiv = 148.2; // кілометрів до Києва
        car.fillTheTankFull();

        double fuelToKryveOzero = car.toRefuelToOvercomeNKM(distanceToKryveOzero);
        car.fillTheTankFull();

        double fuelToZashkiv = car.toRefuelToOvercomeNKM(distanceToZhashkiv);
        car.fillTheTankFull();

        double fuelToKiev =car.theRemainingFuelOvercomingNkm(distanceToKyiv);
        double totalFuel = fuelToKryveOzero+fuelToZashkiv+distanceToKyiv;
        double totalCost = totalFuel * fuelPrice;


        System.out.printf("It is necessary to add %.2f l of fuel for %.2f UAH%n", totalFuel, totalCost);
        System.out.printf("Remaining fuel in Kyiv: %.2f l", car.theRemainingFuelOvercomingNkm(distanceToKyiv));
    }


    }

/*

у класі Мейн треба визначити та вивести на екран скільки треба долити палива
та його вартість якщо маршрут у нас Одеса – Київ
------------------------------------------------------------------------------------------------------------
+ 2 обов'язкові зупинки для дозаправки Криве Озеро та Жашків
+ скільки буде коштувати повна поїздка
+ залишок палива у пункті призначення
вартість палива передавати як аргумент програми + результати виконання додати скріншотом
 */