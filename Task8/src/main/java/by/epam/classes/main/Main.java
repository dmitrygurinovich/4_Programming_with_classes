package by.epam.classes.main;

import by.epam.classes.entity.CustomerBase;
import by.epam.classes.logic.CustomerBaseLogic;
import by.epam.classes.entity.Customer;

import java.math.BigInteger;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    Найти и вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {
    public static void main(String[] args) {

        CustomerBase base = new CustomerBase();

        base.addCustomer("Gurinovich", "Dmitry", "Vasil'evich", "Minsk", (new BigInteger("4545636374748585")), 546367);
        base.addCustomer("Bezmen", "Alexandr", "Ivanovich", "Timoshki", (new BigInteger("1435675309789284")), 123652);
        base.addCustomer("Malash", "Oksana", "Nikolaevna", "Kuhty", (new BigInteger("2317890268290575")), 221689);
        base.addCustomer("Palvovski", "Alexandr", "Alexandrovich", "Malinovka", (new BigInteger("1123586735460990")), 114567);
        base.addCustomer("Romanchik", "Roman", "Vladimirovich", "Vezhi", (new BigInteger("3658872456379746")), 243576);

        CustomerBaseLogic logic = new CustomerBaseLogic();

        for(Customer customer : base.getBase()) {
            System.out.println(customer);
        }

        logic.sort(base);

        for(Customer customer : base.getBase()) {
            System.out.println(customer);
        }

        for (Customer customer : logic.searchCustomersByCreditCard(base, new BigInteger("2187456376546354"), new BigInteger("3765645636456535"))) {
            System.out.println(customer);
        }
    }
}
