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
        BankAccount[] bankAccounts = new BankAccount[] {
                new BankAccount(new Client("Dmitry", "Gurinovich"), new Account(1200), new Account(320)),
                new BankAccount(new Client("Alexandr", "Bezmen"), new Account(800), new Account(-200), new Account(130)),
                new BankAccount(new Client("Julia", "Pentyak"), new Account(1080), new Account(27), new Account(-800))
        };

        Bank bank = new Bank(bankAccounts);
        BankLogic logic = new BankLogic();

        logic.blockAccount(bank, 10001);
        System.out.println(logic.searchAccount(bank, 10001));

        logic.unblockAccount(bank, 10001);
        System.out.println(logic.searchAccount(bank, 10001));

        System.out.println(logic.getSumOfAllAccounts(bank));
        System.out.println(logic.getSumNegativeAccountBalances(bank));
        System.out.println(logic.getSumPositiveAccountBalances(bank));
    }
}
