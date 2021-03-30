package by.epam.classes.entity;

import java.util.Arrays;

public class Permit {
    private int days;
    private int price;
    private Hotel hotel;
    private Meal[] meal;
    private Healing[] healing;
    private Transport transport;

    public Permit(Transport transport,Hotel hotel, Meal[] meal, Healing[] healing) {
        this.transport = transport;
        this.hotel = hotel;
        this.meal = meal;
        this.healing = healing;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Meal[] getMeal() {
        return meal;
    }

    public void setMeal(Meal[] meal) {
        this.meal = meal;
    }

    public Healing[] getHealing() {
        return healing;
    }

    public void setHealing(Healing[] healing) {
        this.healing = healing;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Permit" +
                "\nTransport: " + transport +
                "\nHotel: " + hotel +
                "\nMeal: " + Arrays.toString(meal) +
                "\nHealing: " + Arrays.toString(healing);
    }
}