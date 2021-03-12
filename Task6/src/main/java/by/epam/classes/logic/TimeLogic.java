package by.epam.classes.logic;

import by.epam.classes.entity.Time;

public class TimeLogic {

    public TimeLogic() {}

    public void changeHours(Time time, int hours) {
        if (hours >= 0 && hours < 23) {
            time.setHours(hours);
        } else {
            time.setHours(0);
        }
    }

    public void changeMinutes(Time time,int minutes) {
        if (minutes >= 0 && minutes < 59) {
            time.setMinutes(minutes);
        } else {
            time.setMinutes(0);
        }
    }

    public void changeSeconds(Time time,int seconds) {
        if (seconds >= 0 && seconds < 59) {
            time.setSeconds(seconds);
        } else {
            time.setSeconds(0);
        }
    }

    public void addHours(Time time,int hours) {
        if (hours <= 0) {
            time.setHours(0);
        } else {
            time.setHours((time.getHours() + hours) % 24);
        }
    }

    public void addMinutes(Time time,int minutes) {
        int tempMinutes;

        if (minutes <= 0) {
            time.setMinutes(0);
        } else {
            tempMinutes = (time.getHours() * 60) + time.getMinutes() + minutes;
            time.setMinutes(tempMinutes % 60);
            time.setHours(((tempMinutes - (tempMinutes % 60)) / 60) % 24);
        }
    }

    public void addSeconds(Time time, int seconds) {
        int tempSeconds;
        int tempMinutes;
        int tempHours;

        seconds = time.getSeconds() + seconds;

        if (seconds <= 0) {
            time.setSeconds(0);
        }

        if (seconds > 0 && seconds < 60) {
            time.setSeconds(seconds);
        }

        if (seconds >= 60 && seconds < 360) {
            tempSeconds = seconds % 60;
            tempMinutes = (seconds - (seconds % 60)) / 60;

            time.setSeconds(tempSeconds);
            time.setMinutes(time.getMinutes() + tempMinutes);
        }

        if (seconds >= 360) {
            seconds += (time.getHours() * 3600) + (time.getMinutes() * 60) + time.getSeconds();
            tempHours = ((seconds - seconds % 3600) / 3600) % 24;
            tempMinutes = (seconds % 3600 - ((seconds % 3600) % 60)) / 60;
            tempSeconds = (seconds % 3600) % 60;

            time.setHours(tempHours);
            time.setMinutes(tempMinutes);
            time.setSeconds(tempSeconds);
        }
    }
}
