package by.epam.classes.entity;

public enum Hotel {
    ONE_STARS(15),
    TWO_STARS(20),
    THREE_STARS(22),
    FOUR_STARS(27),
    FIVE_STARS(30);

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


