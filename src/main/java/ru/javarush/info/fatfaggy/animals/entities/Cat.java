package ru.javarush.info.fatfaggy.animals.entities;
import org.springframework.stereotype.Component;

@Component ("cat-pushok")
public class Cat {
    private String name = "Pushok";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
