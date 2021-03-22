package by.epam.classes.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Bank {
    private ArrayList<BankAccount> bankAccounts;

    public Bank(BankAccount ... bankAccounts) {
        this.bankAccounts = new ArrayList<>(Arrays.asList(bankAccounts));
    }

    public Bank(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return bankAccounts.equals(bank.bankAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankAccounts);
    }

    @Override
    public String toString() {
        return "All bank accounts:\n"+ bankAccounts;
    }
}
