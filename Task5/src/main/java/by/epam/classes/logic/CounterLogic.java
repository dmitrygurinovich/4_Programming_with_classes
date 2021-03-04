package by.epam.classes.logic;

import by.epam.classes.entity.Counter;

public class CounterLogic {

    public CounterLogic() {

    }

    public int incrementValue(Counter counter) {
        if (counter.getCurrentValue() < counter.getMaxValue()) {
            counter.setCurrentValue(counter.getCurrentValue() + 1);
        }
        return counter.getCurrentValue();
    }

    public int decrementValue(Counter counter) {
        if (counter.getCurrentValue() > counter.getMinValue()) {
            counter.setCurrentValue(counter.getCurrentValue() - 1);
        }
        return counter.getCurrentValue();
    }

    public String printCurrentValue(Counter counter) {
        return counter.toString();
    }
}
