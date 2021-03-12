package by.epam.classes.entity;

import java.math.BigInteger;
import java.util.Objects;

public class Customer {
    private static int defaultId = 1;
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private BigInteger creditCardNumber;
    private long bankAccountNumber;

    public Customer(String lastName, String firstName, String patronymic, String address, BigInteger creditCardNumber, int bankAccountNumber) {
        this.id = defaultId++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(BigInteger creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && bankAccountNumber == customer.bankAccountNumber && Objects.equals(lastName, customer.lastName) && Objects.equals(firstName, customer.firstName) && Objects.equals(patronymic, customer.patronymic) && Objects.equals(address, customer.address) && Objects.equals(creditCardNumber, customer.creditCardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, patronymic, address, creditCardNumber, bankAccountNumber);
    }

    @Override
    public String toString() {
        return  "id: " + id +
                "\nLast name: " + lastName +
                "\nFirst name: " + firstName +
                "\nPatronymic: " + patronymic +
                "\nAddress: " + address +
                "\nCredit card number: " + creditCardNumber +
                "\nBank account number: " + bankAccountNumber + "\n";
    }
}
