package ru.javarush.info.fatfaggy.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javarush.info.fatfaggy.animals.entities.*;

public class Main {
    public static void main(String[] args) {
        // Вариант 1. Когда свои бины. Создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
        //        ApplicationContext context =
        //                new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals.entities");

        // Вариант 2. Когда бины лежат в другой библиотеке. Созаем пакет "configs" и делаем на него ссылку
        // В таком случае спринг пройдется по этому пакету и найдет все классы, которые отмечены аннотацией @Configuration.

        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals.configs");

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog-wolfy");
        Parrot parrot = context.getBean("parrot-matros", Parrot.class);

        System.out.println("Cat name: " + cat.getName());
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Parrot name: " + parrot.getName());
    }
}
