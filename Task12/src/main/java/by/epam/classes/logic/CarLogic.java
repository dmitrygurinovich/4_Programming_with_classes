package by.epam.classes.logic;

import by.epam.classes.entity.Car;
import by.epam.classes.entity.Wheel;

public class CarLogic {

    public CarLogic() {

    }

    public void changeWgeel(Car car, Wheel newWheel) {
        car.setWheel(newWheel);
    }

    public void refuel(Car car, int liters) {
        if (car.getVolumeOfFuel() + liters > car.getMaxVolumeOfTank()) {
            car.setVolumeOfFuel(car.getMaxVolumeOfTank());
        } else {
            car.setVolumeOfFuel(car.getVolumeOfFuel() + liters);
        }
    }

    public String printModel(Car car) {
        return car.getManufacturer() + " " + car.getModel();
    }

    public String drive(Car car, int speed, int distance) {
        if ((distance * car.getEngine().getFuelFor100rm()) / 100 < car.getVolumeOfFuel()) {
            car.setSpeed(speed);
            car.setVolumeOfFuel(car.getVolumeOfFuel() - (distance * car.getEngine().getFuelFor100rm()) / 100);
            return "\nCar driving with speed " + speed + " km/h " + distance + " km and will use " + (distance * car.getEngine().getFuelFor100rm() / 100) + " liters of fuel!\n" ;
        } else {
            return "\nNot enough fuel for distance " + distance + " km!";
        }
    }
}
