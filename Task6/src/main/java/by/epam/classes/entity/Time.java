package by.epam.classes.entity;

import java.util.Objects;

/*
 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours < 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }

        if (minutes >= 0 && minutes < 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }

        if (seconds >= 0 && seconds < 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours && minutes == time.minutes && seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Current time: "
                + hours + ":" +
                + minutes + ":" +
                + seconds;
    }

    /*
    public void changeHours(int hours) {
        if (hours >= 0 && hours < 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void changeMinutes(int minutes) {
        if (minutes >= 0 && minutes < 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void changeSeconds(int seconds) {
        if (seconds >= 0 && seconds < 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public void addHours(int hours) {
        int tempHours = 0;

        if (hours <= 0) {
            this.hours = 0;
        } else {
            tempHours = (this.hours + hours) % 24;
        }

        this.hours = tempHours;

    }

    public void addMinutes(int minutes) {
        int tempMinutes;

        if (minutes <= 0) {
            this.minutes = 0;
        } else {
            tempMinutes = (this.hours * 60) + this.minutes + minutes;
            this.minutes = tempMinutes % 60;
            this.hours = ((tempMinutes - (tempMinutes % 60)) / 60) % 24;
        }
    }

    public void addSeconds(int seconds) {
        int tempSeconds;
        int tempMinutes;
        int tempHours;

        seconds = this.seconds + seconds;

        if (seconds <= 0) {
            this.seconds = 0;
        }

        if (seconds > 0 && seconds < 60) {
            this.seconds = seconds;
        }

        if (seconds >= 60 && seconds < 360) {
            tempSeconds = seconds % 60;
            tempMinutes = (seconds - (seconds % 60)) / 60;

            this.seconds = tempSeconds;
            this.minutes = this.minutes + tempMinutes;
        }

        if (seconds >= 360) {
            seconds += (this.hours * 3600) + (this.minutes * 60) + this.seconds;
            tempHours = ((seconds - seconds % 3600) / 3600) % 24;
            tempMinutes = (seconds % 3600 - ((seconds % 3600) % 60)) / 60;
            tempSeconds = (seconds % 3600) % 60;

            this.hours = tempHours;
            this.minutes = tempMinutes;
            this.seconds = tempSeconds;
        }


    }
    */



}
