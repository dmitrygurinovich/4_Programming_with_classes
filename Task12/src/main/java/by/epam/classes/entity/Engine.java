package by.epam.classes.entity;

public class Engine {
    private int numberOfCylinders;
    private double capacity;
    private int power;
    private String fuelType;
    private double fuelFor100km;

    public Engine(int numberOfCylinders, double capacity, int power, String fuelType, double fuelFor100km) {
        this.numberOfCylinders = numberOfCylinders;
        this.capacity = capacity;
        this.power = power;
        this.fuelType = fuelType;
        this.fuelFor100km = fuelFor100km;
    }

    public Engine() {

    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelFor100rm() {
        return fuelFor100km;
    }

    public void setFuelFor100rm(double fuelFor100rm) {
        this.fuelFor100km = fuelFor100rm;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(capacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fuelFor100km);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
        result = prime * result + numberOfCylinders;
        result = prime * result + power;
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
        Engine other = (Engine) obj;
        if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
            return false;
        if (Double.doubleToLongBits(fuelFor100km) != Double.doubleToLongBits(other.fuelFor100km))
            return false;
        if (fuelType == null) {
            if (other.fuelType != null)
                return false;
        } else if (!fuelType.equals(other.fuelType))
            return false;
        if (numberOfCylinders != other.numberOfCylinders)
            return false;
        if (power != other.power)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Number of cylinders: " + numberOfCylinders + "\nCapacity: " + capacity + "\nPower: " + power + "\nFuel type: "
                + fuelType + "\nNeed fuel for 100 km: " + fuelFor100km;
    }

}
