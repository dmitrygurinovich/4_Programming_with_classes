package by.epam.classes.logic;

import by.epam.classes.entity.Tour;
import by.epam.classes.entity.TourOperator;
import by.epam.classes.entity.TourType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TourOperatorLogic {
    public TourOperatorLogic() {

    }

    public ArrayList<Tour> searchTourByType(TourOperator tourOperator, TourType type) {
        ArrayList<Tour> result = new ArrayList<>();

        for (Tour tour : tourOperator.getTourList()) {
            if (tour.getType().equals(type)) {
                result.add(tour);
            }
        }
        return result;
    }

    public void sortToursByPrice(TourOperator operator) {
        Collections.sort(operator.getTourList(),
                new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        return o1.getPrice() - o2.getPrice();
                    }
                });
    }

    public void sortToursByHotel(TourOperator operator) {
        Collections.sort(operator.getTourList(), new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                return o1.getHotel().getPrice() - o2.getHotel().getPrice();
            }
        });
    }
}
