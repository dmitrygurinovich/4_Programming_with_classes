package by.epam.classes.main;

import by.epam.classes.entity.Hotel;
import by.epam.classes.entity.Meal;
import by.epam.classes.entity.Tour;
import by.epam.classes.entity.TourType;

/*
 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Tour(TourType.EXCURSION, "Minsk", 2));
        System.out.println(new Tour(TourType.CRUISE, new Meal[]{Meal.BREAKFAST, Meal.LUNCH, Meal.DINNER}, 7));
        System.out.println(new Tour(TourType.SHOPPING, "Madrid", Hotel.FOUR_STARS, new Meal[]{Meal.BREAKFAST, Meal.DINNER, Meal.SUPPER}, 1));
    }
}
