package by.epam.classes.entity;

import java.util.Locale;

public enum Meal {
    BREAKFAST(10),
    LUNCH(15),
    DINNER(10),
    SUPPER(7),
    ALL_INCLUSIVE(38);

    final private int price;

    Meal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String[] temp = super.toString().toLowerCase().split("_");
        if (temp.length == 2) {
            return temp[0].substring(0, 1).toUpperCase(Locale.ROOT) + temp[0].substring(1) + " " + temp[1] + ": price - " + price + "$";
        } else {
            return temp[0].substring(0, 1).toUpperCase(Locale.ROOT) + temp[0].substring(1) + ": price - " + price + "$";
        }
    }
}
