package by.epam.classes.task8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerBase {
    private ArrayList<Customer> base = new ArrayList<>();

    public ArrayList<Customer> getBase() {
        return base;
    }

    public void addCustomer(String lastName, String firstName, String patronymic, String address, BigInteger creditCardNumber, int bankAccountNumber) {
        this.base.add(new Customer(lastName, firstName, patronymic, address, creditCardNumber, bankAccountNumber));
    }

    public ArrayList<Customer> searchCustomersByCreditCardNumberFromInterval(BigInteger min, BigInteger max) {
        ArrayList<Customer> tempList = new ArrayList<>();

        for (Customer customer : base) {

        }

        return tempList;
    }

    public void print() {
        for (Customer customer : base) {
            System.out.println(customer.toString());
        }
    }

    public void sort() {
        Collections.sort(base, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }
}
