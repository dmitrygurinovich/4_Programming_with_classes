package by.epam.classes.entity;

public enum Hotel {
    ONE_STARS(100),
    TWO_STARS(200),
    THREE_STARS(300),
    FOUR_STARS(400),
    FIVE_STARS(500);

    final private int price;

    Hotel(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String[] result = super.toString().toLowerCase().split("_");
        return "[" + result[0].substring(0, 1).toUpperCase() + result[0].substring(1) + " " + result[1] + ": price - " + price + "$]";
    }
}


