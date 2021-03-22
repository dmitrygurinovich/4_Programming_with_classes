package by.epam.classes.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BankAccount {
    private static int defaultClientID = 1;
    private int clientID;
    private Client client;
    private ArrayList<Account> accounts;

    public BankAccount(Client client, Account... accounts) {
        this.client = client;
        this.accounts = new ArrayList<>(Arrays.asList(accounts));
        this.clientID = defaultClientID++;
    }

    public BankAccount() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return clientID == that.clientID &&
                Objects.equals(client, that.client) &&
                Objects.equals(accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, client, accounts);
    }

    @Override
    public String toString() {
        return "- BankAccount -\n" +
                "# Client " + clientID + ":\n" + client +
                "\n# Accounts: \n" + accounts;
    }
}
