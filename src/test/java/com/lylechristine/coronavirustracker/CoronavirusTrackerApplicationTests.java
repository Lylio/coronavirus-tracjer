package com.lylechristine.coronavirustracker;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.lylechristine.coronavirustracker.controllers.HomeController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class CoronavirusTrackerApplicationTests {

    @Autowired
    private HomeController homeController;

    @Test
    void contextLoads() {
        assertThat(homeController).isNotNull();
    }

    //Two dummy tests for configuring Jenkins
    @Test
    void dummyTest1() {
        int x = 88;
        int y = 88;

        assertEquals(x, y);
        log.info("*** First test passed successfully ***");
    }

    @Test
    void dummyTest2() {
        int a = 900;
        int b = 900;

        assertEquals(a, b);
        log.info("*** Second dummy test passed successfully ***");
    }
}
