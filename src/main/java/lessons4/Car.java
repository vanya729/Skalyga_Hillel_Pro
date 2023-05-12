package lessons4;

    public class Car {
        private double tankVolume;
        private double remainderInTank;
        private double fuelConsumptionPer100Km;

        public Car(double tankVolume, double remainderInTank, double fuelConsumptionPer100Km) {
            this.tankVolume = tankVolume;
            this.remainderInTank = remainderInTank;
            this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        }

        public double getTankVolume() {
            return tankVolume;
        }

        public void setTankVolume(double tankVolume) {
            this.tankVolume = tankVolume;
        }

        public double getRemainderInTank() {
            return remainderInTank;
        }

        public void setRemainderInTank(double remainderInTank) {
            this.remainderInTank = remainderInTank;
        }

        public double getFuelConsumptionPer100Km() {
            return fuelConsumptionPer100Km;
        }

        public void setFuelConsumptionPer100Km(double fuelConsumptionPer100Km) {
            this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        }

        public void fillTheTankFull() {
            remainderInTank = tankVolume;
        }

        public double theRemainingFuelOvercomingNkm(double distance) {
            double fuelRemaining =(distance / 100) * fuelConsumptionPer100Km;
            if (remainderInTank<=fuelRemaining){
                remainderInTank-=fuelRemaining;
            }else {
                remainderInTank=0;
            }
            return fuelRemaining;
        }

        public double toRefuelToOvercomeNKM(double distance) {
            double remainingDistance = (fuelConsumptionPer100Km/100)*distance;
            return Math.max(remainingDistance - remainderInTank, 0);
        }
    }