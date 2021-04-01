package by.epam.classes.main;

import by.epam.classes.entity.*;

/*
 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Tour(TourType.EXCURSION, "Minsk", 2));
        System.out.println(new Tour(TourType.CRUISE, new Meal[]{Meal.BREAKFAST, Meal.LUNCH, Meal.DINNER}, 7));
        System.out.println(new Tour(TourType.SHOPPING, new Shopping[]{Shopping.BOUTIQUE, Shopping.MARKET, Shopping.MALL}, "Madrid", Hotel.FOUR_STARS,
                new Meal[]{Meal.BREAKFAST, Meal.DINNER, Meal.SUPPER}, 1));
        System.out.println(new Tour(TourType.TREATMENT, "Pataya", Transport.PLANE, Hotel.TWO_STARS,
                new Meal[]{Meal.BREAKFAST}, new Treatment[]{Treatment.MASSAGE, Treatment.ACUPUNCTURE, Treatment.INHALATION}, 7));
        System.out.println(new Tour(TourType.RECREATION, "Hurgada", Transport.PLANE, Hotel.FOUR_STARS,
                new Meal[]{Meal.ALL_INCLUSIVE}, new Treatment[]{Treatment.POOL, Treatment.SAUNA, Treatment.ACUPUNCTURE}, 11));

        //TODO: create class TourAggregator with ArrayList of Tours, then create class ToruAggregatorLogic, where create metod for searching by tour type

    }
}
