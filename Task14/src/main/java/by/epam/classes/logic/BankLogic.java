package by.epam.classes.logic;

import by.epam.classes.entity.Account;
import by.epam.classes.entity.Bank;
import by.epam.classes.entity.BankAccount;

import java.util.Collections;
import java.util.Comparator;

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

    public void sortAccountsByNumber(Bank bank) {
        for (BankAccount bankAccount : bank.getBankAccounts()) {

            Collections.sort(bankAccount.getAccounts(), new Comparator<Account>() {
                @Override
                public int compare(Account o1, Account o2) {
                    return o1.getNumber() - o2.getNumber();
                }
            });
        }
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
