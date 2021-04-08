package by.epam.classes.entity;

import java.util.Arrays;
import java.util.Objects;

public class Tour {
    private String city;
    final private TourType type;
    private int days;
    final private int price;
    private Shopping[] shopping;
    private Hotel hotel;
    private Meal[] meals;
    private Treatment[] treatments;
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

        int tempPrice = transport.getPrice() + type.getPrice() * days;

        for (Meal meal : meals) {
            tempPrice += meal.getPrice() * days;
        }

        this.price = tempPrice;
    }

    /**
     * @param type SHOPPING
     */
    public Tour(TourType type, Shopping[] shoppingPlaces, String city, Hotel hotel, Meal[] meals, int days) {
        this.type = type;
        this.shopping = shoppingPlaces;
        this.transport = Transport.BUS;
        this.hotel = hotel;
        this.city = city;
        this.days = days;
        this.meals = meals;

        int tempPrice = type.getPrice() * days +
                transport.getPrice() +
                hotel.getPrice() * days;

        for (Shopping shopping : shoppingPlaces) {
            tempPrice+= shopping.getPrice() * days;
        }

        for (Meal meal : meals) {
            tempPrice += meal.getPrice() * days;
        }

        this.price = tempPrice;
    }

    /**
     * @param type TREATMENT, RECREATION
     */
    public Tour(TourType type, String city , Transport transport, Hotel hotel, Meal[] meals, Treatment[] treatments, int days) {
        this.type = type;
        this.city = city;
        this.transport = transport;
        this.hotel = hotel;
        this.meals = meals;
        this.treatments = treatments;
        this.days = days;

        int tempPrice = type.getPrice() * days +
                transport.getPrice() +
                hotel.getPrice() * days;

        for (Treatment treatment : treatments) {
            tempPrice += treatment.getPrice() * days;
        }

        for (Meal meal : meals) {
            tempPrice += meal.getPrice() * days;
        }

        this.price = tempPrice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TourType getType() {
        return type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPrice() {
        return price;
    }

    public Shopping[] getShopping() {
        return shopping;
    }

    public void setShopping(Shopping[] shopping) {
        this.shopping = shopping;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Meal[] getMeals() {
        return meals;
    }

    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }

    public Treatment[] getTreatments() {
        return treatments;
    }

    public void setTreatments(Treatment[] treatments) {
        this.treatments = treatments;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return days == tour.days &&
                price == tour.price &&
                city.equals(tour.city) &&
                type == tour.type &&
                Arrays.equals(shopping, tour.shopping) &&
                hotel == tour.hotel &&
                Arrays.equals(meals, tour.meals) &&
                Arrays.equals(treatments, tour.treatments) &&
                transport == tour.transport;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(city, type, days, price, hotel, transport);
        result = 31 * result + Arrays.hashCode(shopping);
        result = 31 * result + Arrays.hashCode(meals);
        result = 31 * result + Arrays.hashCode(treatments);
        return result;
    }

    @Override
    public String toString() {
        return  (type !=null ? "\nTour type: " + type : "") +
                (shopping !=null ? "\nDo shopping in: " + Arrays.toString(shopping) : "") +
                (days != 0 ? "\nDays: [" + days + "]" : "") +
                (city != null ? "\nCity: [" + city + "]" : "") +
                (transport != null ? "\nTransport: " + transport : "") +
                (hotel != null ? "\nHotel: " + hotel : "") +
                (meals != null ? "\nMeals: " + Arrays.toString(meals) : "") +
                (treatments != null ? "\nTreatment: " + Arrays.toString(treatments) : "") +
                (price != 0 ? "\nTotal price: " + price + "$\n" : "");
    }

}