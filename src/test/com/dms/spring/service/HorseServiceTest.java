package com.dms.spring.service;


import com.dms.spring.config.SpringContextConfig;
import com.dms.spring.entity.Horse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfig.class)
@PropertySource("prop.properties")
public class HorseServiceTest {

    @Autowired
    HorseService horseService;

    @Resource
    Environment env;

    @Test
    public void getHorsesTest() {
        List<Horse> actual = horseService.getHorses();
        for (int i = 0; i < 5; i++)
            Assert.assertEquals(env.getProperty("horse" + i), actual.get(i).getName());
    }
}