package patrones_creacionales.builder;

import patrones_creacionales.builder.builders.CarBuilder;
import patrones_creacionales.builder.builders.CarManualBuilder;
import patrones_creacionales.builder.cars.Car;
import patrones_creacionales.builder.cars.Manual;
import patrones_creacionales.builder.director.Director;

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
