package by.epam.classes.main;

import by.epam.classes.entity.*;

/*
 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Main {
    public static void main(String[] args) {
        Permit permit = new Permit(
                Transport.PLANE,
                Hotel.ONE_STARS,
                new Meal[]{Meal.DINNER, Meal.LUNCH, Meal.BREAKFAST},
                new Healing[]{Healing.MASSAGE, Healing.SAUNA, Healing.POOL}
        );
        System.out.println(permit);
    }
}
