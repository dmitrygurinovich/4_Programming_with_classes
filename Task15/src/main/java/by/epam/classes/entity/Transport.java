package by.epam.classes.entity;

public enum Transport {
    BUS(70),
    TRAIN(50),
    PLANE(120),
    SHIP(80);

    final private int price;

    Transport(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + super.toString().substring(0, 1).toUpperCase() + super.toString().substring(1).toLowerCase() + ": " +
                "price - " + price + "$]";
    }
}
