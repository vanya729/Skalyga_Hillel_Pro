package lessons4;

    public class Car {
        double tankVolume;                     // об'єм бака
        double remainderInTank;                 //залишок
        double fuelConsumptionPer100Km;       //витрата палива

        public Car(double tankVolume, double remainderInTank, double fuelConsumptionPer100Km) {
            this.tankVolume = tankVolume;
            this.remainderInTank = remainderInTank;
            this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        }


        public void fillTheTankFull() { //залити повний бак з урахуванням обсягу залишку
            remainderInTank = tankVolume;
//            System.out.println("Remaining volume in the tank: " +remainderInTank);
        }

        public double theRemainingFuelOvercomingNkm(double distance) {//визначити залишок палива з подолання N км
            double fuelRemaining =(distance / 100) * fuelConsumptionPer100Km;
            if (remainderInTank<=fuelRemaining){
                remainderInTank-=fuelRemaining;
            }else {
                remainderInTank=0;
            }
//            System.out.println("The remaining fuel after overcoming N km: " + fuelRemaining);
            return fuelRemaining;
        }


        public double toRefuelToOvercomeNKM(double distance) {//визначити скільки треба дозаправити палива для подолання N км
            double remainingDistance = (fuelConsumptionPer100Km/100)*distance;
//            System.out.println(remainingDistance);
//            System.out.println("To overcome " + distance + " km, you need: " + remainingDistance);
            return Math.max(remainingDistance - remainderInTank, 0);
        }
    }
/*
Створити клас машина з полями
об'єм бака
залишок у баку
витрата палива на 100 км
------------------------------------------
створити методи:

залити повний бак з урахуванням обсягу залишку
визначити залишок палива з подолання N км
визначити скільки треба до заправити палива для подолання N км
у класі Мейн треба визначити та вивести на екран скільки треба долити палива
та його вартість якщо маршрут у нас Одеса – Київ

------------------------------------------------------------------------------------------------------------
+ 2 обов'язкові зупинки для дозаправки Криве Озеро та Жашків
+ скільки буде коштувати повна поїздка
+ залишок палива у пункті призначення
вартість палива передавати як аргумент програми + результати виконання додати скріншотом
 */