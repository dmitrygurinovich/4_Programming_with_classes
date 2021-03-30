package by.epam.classes.entity;

public enum Meal {
    BREAKFAST(100),
    LUNCH(200),
    DINNER(300),
    SUPPER(400);

    final private int price;

    Meal (int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString().substring(0,1).toUpperCase() +
                super.toString().substring(1).toLowerCase() + ": price - " + price + "$";
    }
}
