package ru.jm.info.fatfaggy.animals.configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.jm.info.fatfaggy.animals.entities.*;
import ru.jm.info.fatfaggy.animals.entities.Cat;
import ru.jm.info.fatfaggy.animals.entities.Dog;
import ru.jm.info.fatfaggy.animals.entities.Parrot;

@Configuration
public class MyConfig1 {

    //    @Bean
//    public Cat getCat() {
//        return new Cat();
//    }
    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean("dog-wolfy")
    public Dog weNeedOneDog() {
        return new Dog();
    }

    @Bean("parrot-matros")
    public Parrot weNeedMoreParrots() {
        return new Parrot();
    }
}
