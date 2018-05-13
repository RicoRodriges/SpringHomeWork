package com.dms.spring.config;

import com.dms.spring.entity.Breed;
import com.dms.spring.entity.Horse;
import com.dms.spring.entity.Rider;
import com.dms.spring.service.EmulationService;
import com.dms.spring.service.HorseService;
import com.dms.spring.service.RaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.dms.spring")
public class SpringContextConfig {

    @Bean
    public List<Horse> horses() {
        List<Horse> list = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            list.add(new Horse("Horse" + i, new Breed("Breed" + i)));
        }
        return list;
    }

    @Bean
    public List<Rider> riders() {
        List<Rider> list = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            list.add(new Rider("Rider" + i));
        }
        return list;
    }
}
