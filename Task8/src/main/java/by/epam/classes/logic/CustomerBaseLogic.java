package by.epam.classes.logic;

import by.epam.classes.entity.CustomerBase;
import by.epam.classes.entity.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerBaseLogic {
    public CustomerBaseLogic() {

    }

    public ArrayList<Customer> searchCustomersByCreditCard(CustomerBase base, BigInteger min, BigInteger max) {
        ArrayList<Customer> tempList = new ArrayList<>();

        for (Customer customer : base.getBase()) {
            if (customer.getCreditCardNumber().compareTo(min) > 0 && customer.getCreditCardNumber().compareTo(max) < 0) {
                tempList.add(customer);
            }
        }

        return tempList;
    }

    public void sort(CustomerBase base) {
        Collections.sort(base.getBase(), new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }
}
