package patrones_creacionales.builder.builders;

import patrones_creacionales.builder.cars.CarType;
import patrones_creacionales.builder.components.Engine;
import patrones_creacionales.builder.components.GPSNavigator;
import patrones_creacionales.builder.components.Transmission;
import patrones_creacionales.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
