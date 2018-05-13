package com.dms.spring.service;

import com.dms.spring.entity.Horse;
import com.dms.spring.entity.Rider;

import java.util.List;

public class HorseService {

    private List<Horse> horses;
    private List<Rider> riders;

    public HorseService(List<Horse> horses, List<Rider> riders) {
        this.horses = horses;
        this.riders = riders;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Rider getRiderByHorse(Horse horse) {
        return riders.get(horses.indexOf(horse));
    }
}
