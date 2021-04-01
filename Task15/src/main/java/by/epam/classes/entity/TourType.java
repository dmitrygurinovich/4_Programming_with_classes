package by.epam.classes.entity;

public enum TourType {
    EXCURSION(30),
    CRUISE(300),
    SHOPPING(20),
    TREATMENT(40),
    RECREATION(40);

    final private int price;

    TourType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" +super.toString().substring(0,1).toUpperCase() +
                super.toString().substring(1).toLowerCase() + ": price - " + price + "$]";
    }
}
