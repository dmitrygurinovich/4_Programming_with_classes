package by.epam.classes.entity;

public class Car {
    private String manufacturer;
    private String model;
    private double maxVolumeOfTank;
    private double volumeOfFuel;
    private int maxSpeed;
    private int speed;
    private Engine engine;
    private Wheel wheel;

    public Car(String manufacturer, String model, int maxVolumeOfTank, int maxSpeed, Engine engine, Wheel wheel) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxVolumeOfTank = maxVolumeOfTank;
        this.volumeOfFuel = 0;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxVolumeOfTank() {
        return maxVolumeOfTank;
    }

    public void setMaxVolumeOfTank(int maxVolumeOfTank) {
        this.maxVolumeOfTank = maxVolumeOfTank;
    }

    public double getVolumeOfFuel() {
        return volumeOfFuel;
    }

    public void setVolumeOfFuel(double d) {
        this.volumeOfFuel = d;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((engine == null) ? 0 : engine.hashCode());
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + maxSpeed;
        long temp;
        temp = Double.doubleToLongBits(maxVolumeOfTank);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + speed;
        temp = Double.doubleToLongBits(volumeOfFuel);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (engine == null) {
            if (other.engine != null)
                return false;
        } else if (!engine.equals(other.engine))
            return false;
        if (manufacturer == null) {
            if (other.manufacturer != null)
                return false;
        } else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (maxSpeed != other.maxSpeed)
            return false;
        if (Double.doubleToLongBits(maxVolumeOfTank) != Double.doubleToLongBits(other.maxVolumeOfTank))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (speed != other.speed)
            return false;
        if (Double.doubleToLongBits(volumeOfFuel) != Double.doubleToLongBits(other.volumeOfFuel))
            return false;
        if (wheel == null) {
            if (other.wheel != null)
                return false;
        } else if (!wheel.equals(other.wheel))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + "\nMax volume of tank: " + maxVolumeOfTank + "\nVolume of fuel: "
                + volumeOfFuel + "\nMax speed: " + maxSpeed + "\nSpeed: " + speed + "\n#Engine\n" + engine
                + "\n#Wheel\n" + wheel + "\n";
    }

}
