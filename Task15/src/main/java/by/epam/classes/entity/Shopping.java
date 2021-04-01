package by.epam.classes.entity;

public enum Shopping {
    MALL(10),
    BOUTIQUE(20),
    MARKET(10);

    final private int price;

    Shopping(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  super.toString().substring(0,1).toUpperCase() + super.toString().substring(1).toLowerCase() +
                ": price - " + price + "$";
    }
}
