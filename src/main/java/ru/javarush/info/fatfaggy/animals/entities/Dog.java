package ru.javarush.info.fatfaggy.animals.entities;
import org.springframework.stereotype.Component;

@Component ("dog-wolfy")
public class Dog {
    private String name = "Wolfy";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
