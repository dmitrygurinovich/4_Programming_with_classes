package by.epam.classes.main;

import by.epam.classes.entity.*;
import by.epam.classes.logic.TourOperatorLogic;

import java.util.ArrayList;

/*
 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Tour> tourList = new ArrayList<>();

        tourList.add(new Tour(TourType.EXCURSION, "Minsk", 2));
        tourList.add(new Tour(TourType.CRUISE, new Meal[]{Meal.BREAKFAST, Meal.LUNCH, Meal.DINNER}, 7));
        tourList.add(new Tour(TourType.SHOPPING, new Shopping[]{Shopping.BOUTIQUE, Shopping.MARKET, Shopping.MALL}, "Madrid", Hotel.FOUR_STARS,
                new Meal[]{Meal.BREAKFAST, Meal.DINNER, Meal.SUPPER}, 1));
        tourList.add(new Tour(TourType.TREATMENT, "Pataya", Transport.PLANE, Hotel.TWO_STARS,
                new Meal[]{Meal.BREAKFAST}, new Treatment[]{Treatment.MASSAGE, Treatment.ACUPUNCTURE, Treatment.INHALATION}, 7));
        tourList.add(new Tour(TourType.RECREATION, "Hurgada", Transport.PLANE, Hotel.FOUR_STARS,
                new Meal[]{Meal.ALL_INCLUSIVE}, new Treatment[]{Treatment.POOL, Treatment.SAUNA, Treatment.ACUPUNCTURE}, 11));

        TourOperator firefly = new TourOperator("Firefly.by", tourList);

        TourOperatorLogic logic = new TourOperatorLogic();

        // logic.sortToursByPrice(firefly); //ok
        logic.sortToursByHotel(firefly);





    }
}
