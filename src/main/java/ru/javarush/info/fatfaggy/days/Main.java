package ru.javarush.info.fatfaggy.days;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javarush.info.fatfaggy.days.entities.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.days.configs");
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
