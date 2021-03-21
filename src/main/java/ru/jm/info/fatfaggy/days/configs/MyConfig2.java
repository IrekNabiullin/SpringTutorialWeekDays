package ru.jm.info.fatfaggy.days.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.jm.info.fatfaggy.days.WeekDay;
import ru.jm.info.fatfaggy.days.entities.*;
import ru.jm.info.fatfaggy.days.entities.Friday;
import ru.jm.info.fatfaggy.days.entities.Monday;
import ru.jm.info.fatfaggy.days.entities.Saturday;
import ru.jm.info.fatfaggy.days.entities.Sunday;
import ru.jm.info.fatfaggy.days.entities.Thursday;
import ru.jm.info.fatfaggy.days.entities.Tuesday;
import ru.jm.info.fatfaggy.days.entities.Wednesday;


import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class MyConfig2 {

    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }
}
