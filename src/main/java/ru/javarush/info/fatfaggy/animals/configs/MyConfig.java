package ru.javarush.info.fatfaggy.animals.configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javarush.info.fatfaggy.animals.entities.*;

@Configuration
public class MyConfig {

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
