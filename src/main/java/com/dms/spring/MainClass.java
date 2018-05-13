package com.dms.spring;

import com.dms.spring.entity.Race;
import com.dms.spring.service.EmulationService;
import com.dms.spring.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        RaceService raceService = (RaceService) context.getBean("raceService");
        EmulationService emulationService = (EmulationService) context.getBean("emulationService");

        Race race = raceService.getRace();
        System.out.println("Race info:");
        race.getInfo().forEach((key, value) -> System.out.println(
                "Horse: " + key.getName() + "; " +
                        "Breed: " + key.getBreed().getName() + "; " +
                        "Rider: " + value.getName()
        ));
        System.out.println("");

        System.out.println("Result of race:");
        emulationService.printResult(race);
    }
}
