package by.epam.classes.logic;

import by.epam.classes.entity.Account;
import by.epam.classes.entity.Bank;
import by.epam.classes.entity.BankAccount;

public class BankLogic {

    public BankLogic() {
    }

    public void blockAccount(Bank bank, int accountNumber) {
        for (BankAccount bankAccount : bank.getBankAccounts()) {
            for (Account account : bankAccount.getAccounts()) {
                if (account.getNumber() == accountNumber) {
                    account.setStatus(false);
                }
            }
        }
    }

    public void unblockAccount(Bank bank, int accountNumber) {
        for (BankAccount bankAccount : bank.getBankAccounts()) {
            for (Account account : bankAccount.getAccounts()) {
                if (account.getNumber() == accountNumber) {
                    account.setStatus(true);
                }
            }
        }
    }

    public BankAccount searchAccount(Bank bank, int accountNumber) {
        for (BankAccount bankAccount : bank.getBankAccounts()) {
            for (Account account : bankAccount.getAccounts()) {
                if (account.getNumber() == accountNumber) {
                    return new BankAccount(bankAccount.getClient(), account);
                }
            }
        }
        return null;
    }

    public void sortAccounts() {

    }

    public int getSumOfAllAccounts(Bank bank) {
        int sum;
        sum = 0;

        for (BankAccount bankAccount : bank.getBankAccounts()) {
            for (Account account : bankAccount.getAccounts()) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    public int getSumNegativeAccountBalances(Bank bank) {
        int sum;
        sum = 0;

        for (BankAccount bankAccount : bank.getBankAccounts()) {
            for (Account account : bankAccount.getAccounts()) {
                if (account.getBalance() < 0) {
                    sum += account.getBalance();
                }
            }
        }
        return sum;
    }

    public int getSumPositiveAccountBalances(Bank bank) {
        int sum;
        sum = 0;

        for (BankAccount bankAccount : bank.getBankAccounts()) {
            for (Account account : bankAccount.getAccounts()) {
                if (account.getBalance() >= 0) {
                    sum += account.getBalance();
                }
            }
        }
        return sum;
    }
}
