package by.epam.classes.entity;

import java.util.Arrays;

public class Tour {
    private String city;
    final private TourType type;
    private int days;
    final private int price;
    private Hotel hotel;
    private Meal[] meals;
    private Treatment[] treatment;
    private Transport transport;

    /**
     * @param type EXCURSION
     */
    public Tour(TourType type, String city, int days) {
        this.transport = Transport.BUS;
        this.type = type;
        this.city = city;
        this.days = days;
        this.price = transport.getPrice() * days + type.getPrice() * days;
    }

    /**
    * @param type CRUISE
     */
    public Tour(TourType type, Meal[] meals, int days) {
        this.type = type;
        this.transport = Transport.SHIP;
        this.meals = meals;
        this.days = days;

        int tempPrice = transport.getPrice() * days + type.getPrice() * days;

        for (Meal meal : meals) {
            tempPrice+= meal.getPrice() * days;
        }

        this.price = tempPrice;
    }

    /**
     * @param type SHOPPING
     */
    public Tour(TourType type, String city, Hotel hotel, Meal[] meals, int days) {
        this.type = type;
        this.transport = Transport.BUS;
        this.hotel = hotel;
        this.city = city;
        this.days = days;
        this.meals = meals;

        int tempPrice = type.getPrice() * days +
                transport.getPrice() * days +
                hotel.getPrice() * days;

        for (Meal meal : meals) {
            tempPrice+= meal.getPrice() *days;
        }

        this.price = tempPrice;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Meal[] getMeal() {
        return meals;
    }

    public void setMeal(Meal[] meals) {
        this.meals = meals;
    }

    public Treatment[] getHealing() {
        return treatment;
    }

    public void setHealing(Treatment[] treatment) {
        this.treatment = treatment;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return  "\nTour type: " + type +
                "\nDays: [" + days + "]" +
                "\nCity: [" + city + "]" +
                "\nTransport: " + transport +
                "\nHotel: " + hotel +
                "\nMeal: " + Arrays.toString(meals) +
                "\nTreatment: " + Arrays.toString(treatment) +
                "\nTotal price: " + price + "$";
    }
}