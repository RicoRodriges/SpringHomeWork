package com.dms.spring.service;

import com.dms.spring.entity.Horse;
import com.dms.spring.entity.Race;
import com.dms.spring.entity.Rider;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RaceService {

    private HorseService horseService;

    public RaceService(HorseService horseService) {
        this.horseService = horseService;
    }

    public Race getRace() {
        List<Horse> horses = new ArrayList<>(horseService.getHorses());

        Map<Horse, Rider> race = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            Horse horse = horses.get(i);
            race.put(horse, horseService.getRiderByHorse(horse));
        }
        return new Race(race);
    }

}
