package ru.javarush.info.fatfaggy.days.entities;

import ru.javarush.info.fatfaggy.days.WeekDay;

public class Sunday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return "Sunday";
    }
}
