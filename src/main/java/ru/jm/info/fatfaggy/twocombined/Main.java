package ru.jm.info.fatfaggy.twocombined;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.jm.info.fatfaggy.animals.entities.Cat;
import ru.jm.info.fatfaggy.animals.entities.Dog;
import ru.jm.info.fatfaggy.animals.entities.Parrot;
import ru.jm.info.fatfaggy.days.WeekDay;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.jm.info.fatfaggy.twocombined.configs");
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog-wolfy");
        Parrot parrot = context.getBean("parrot-matros", Parrot.class);

        System.out.println("Cat name: " + cat.getName());
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Parrot name: " + parrot.getName());
    }
}