package by.epam.classes.entity;

import java.util.Locale;

public enum Meal {
    BREAKFAST,
    LUNCH,
    DINNER,
    SUPPER;

    @Override
    public String toString() {
        return super.toString().substring(0,1).toUpperCase(Locale.ROOT) +
                super.toString().substring(1).toLowerCase(Locale.ROOT);
    }
}
