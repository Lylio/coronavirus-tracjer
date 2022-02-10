package com.lylechristine.coronavirustracker;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.lylechristine.coronavirustracker.controllers.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class CoronavirusTrackerApplicationTests {

    @Autowired
    private HomeController homeController;

    private static final Logger LOGGER = LoggerFactory.getLogger(CoronavirusTrackerApplicationTests.class);

    @Test
    void contextLoads() {
        assertThat(homeController).isNotNull();
    }

    // Dummy tests for configuring Jenkins
    @Test
    void dummyTest1() {
        int x = 88;
        int y = 88;
        assertEquals(x, y);
        LOGGER.info("*** DUMMY TEST 1 PASSED ***");
    }

    @Test
    void dummyTest2() {
        int a = 900;
        int b = 5001;
        assertNotEquals(a, b);
        LOGGER.info("*** DUMMY TEST 2 PASSED ***");
    }

    @Test
    void dummyTest3() {
        Boolean valueIsFalse = false;
        assertFalse(valueIsFalse);
        LOGGER.info("*** DUMMY TEST 3 PASSED ***");
    }
}
