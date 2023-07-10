package lessons17.builder.builders;

import lessons17.builder.cars.CarType;
import lessons17.builder.components.Engine;
import lessons17.builder.components.GPSNavigator;
import lessons17.builder.components.Transmission;
import lessons17.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}