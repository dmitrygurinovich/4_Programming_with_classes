package by.epam.classes.entity;

public enum Treatment {
    MASSAGE(60),
    POOL(40),
    SAUNA(50),
    INHALATION(30),
    ACUPUNCTURE(70);

    final private int price;

    Treatment(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString().substring(0, 1).toUpperCase() + super.toString().substring(1).toLowerCase() + ": " +
                "price - " + price + "$";
    }
}
