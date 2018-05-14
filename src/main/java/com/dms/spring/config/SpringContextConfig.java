package com.dms.spring.config;

import com.dms.spring.entity.Breed;
import com.dms.spring.entity.Horse;
import com.dms.spring.entity.Rider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.dms.spring")
@PropertySource("prop.properties")
public class SpringContextConfig {

    @Resource
    Environment env;

    @Bean
    public List<Horse> horses() {
        List<Horse> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(new Horse(env.getProperty("horse" + i), new Breed(env.getProperty("breed" + i))));
        }
        return list;
    }

    @Bean
    public List<Rider> riders() {
        List<Rider> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(new Rider(env.getProperty("rider" + i)));
        }
        return list;
    }
}
