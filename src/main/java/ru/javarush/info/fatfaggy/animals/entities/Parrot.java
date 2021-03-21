package ru.javarush.info.fatfaggy.animals.entities;
import org.springframework.stereotype.Component;

@Component ("parrot-matros")
public class Parrot {
    private String name = "Matros";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
