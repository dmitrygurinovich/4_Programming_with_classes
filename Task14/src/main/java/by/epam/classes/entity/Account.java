package by.epam.classes.entity;

import java.util.Objects;

public class Account {
    private static int startNumber = 10000;
    private int number;
    private boolean status;
    private int balance;

    public Account(int balance, int number) {
        this.number = number;
        this.status = true;
        this.balance = balance;
    }

    public Account(int balance) {
        this.number = startNumber++;
        this.status = true;
        this.balance = balance;
    }

    public Account() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number &&
                status == account.status &&
                balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, status, balance);
    }

    @Override
    public String toString() {
        if (status) {
            return "Account number: " + number + ", " +
                    "Status: unblocked" + ", " +
                    "Balance: " + balance + "$";
        } else {
            return "Account number: " + number + ", " +
                    "Status: blocked" + ", " +
                    "Balance: " + balance + "$";
        }
    }
}
