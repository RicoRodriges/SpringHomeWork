package com.dms.spring.service;

import com.dms.spring.entity.Horse;
import com.dms.spring.entity.Race;
import com.dms.spring.entity.Rider;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmulationService {

    public void printResult(Race race) {
        int i = 0;
        for (Map.Entry<Horse, Rider> entry : race.getInfo().entrySet()) {
            System.out.println("Horse \"" + entry.getKey().getName() + "\" " + entry.getKey().getBreed().getName() +
                    " with rider \"" + entry.getValue().getName() + "\" won " + (++i) + " place");
        }
        System.out.println("Race has finished");
    }
}
