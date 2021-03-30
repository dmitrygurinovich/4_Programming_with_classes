package by.epam.classes.entity;

public enum Healing {
    MASSAGE(60),
    POOL(40),
    SAUNA(50),
    INHALATION(30),
    ACUPUNCTURE(70);

    final private int price;

    Healing(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  super.toString().substring(0,1).toUpperCase() + super.toString().substring(1).toLowerCase() + ": " +
                "price - " + price + "$";
    }
}
