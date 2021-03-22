package by.epam.classes.entity;

import java.util.Objects;

public class Client {
    private String firstName;
    private String secondName;

    public Client(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName) &&
                Objects.equals(secondName, client.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                "\nSecond name: " + secondName;
    }
}
