package by.epam.classes.main;

import by.epam.classes.entity.Account;
import by.epam.classes.entity.Bank;
import by.epam.classes.entity.BankAccount;
import by.epam.classes.entity.Client;
import by.epam.classes.logic.BankLogic;

/*
 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 всем счетам, имеющим положительный и отрицательный балансы отдельно
 */
public class Main {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[]{
                new BankAccount(new Client("Dmitry", "Gurinovich"), new Account(1200, 354), new Account(320, 187)),
                new BankAccount(new Client("Alexandr", "Bezmen"), new Account(800, 987), new Account(-200, 113), new Account(130, 825)),
                new BankAccount(new Client("Julia", "Pentyak"), new Account(1080, 97), new Account(27, 665), new Account(-800, 12))
        };

        Bank bank = new Bank(bankAccounts);
        BankLogic logic = new BankLogic();

        System.out.println(bank);
        logic.sortAccountsByNumber(bank);
        System.out.println(bank);

        logic.blockAccount(bank, 354);
        System.out.println(logic.searchAccount(bank, 354));

        logic.unblockAccount(bank, 354);
        System.out.println(logic.searchAccount(bank, 354));

        System.out.println(logic.getSumOfAllAccounts(bank));
        System.out.println(logic.getSumNegativeAccountBalances(bank));
        System.out.println(logic.getSumPositiveAccountBalances(bank));
    }
}
