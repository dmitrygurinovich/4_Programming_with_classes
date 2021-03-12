package by.epam.classes.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Objects;

public class CustomerBase {
    private ArrayList<Customer> base = new ArrayList<>();

    public void addCustomer(String lastName, String firstName, String patronymic, String address, BigInteger creditCardNumber, int bankAccountNumber) {
        this.base.add(new Customer(lastName, firstName, patronymic, address, creditCardNumber, bankAccountNumber));
    }

    public ArrayList<Customer> getBase() {
        return base;
    }

    public void setBase(ArrayList<Customer> base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBase that = (CustomerBase) o;
        return Objects.equals(base, that.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }
}

