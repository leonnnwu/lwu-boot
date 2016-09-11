package com.lwu.boot.controller;

import com.lwu.boot.Application;
import com.lwu.boot.model.Ship;
import com.lwu.boot.repository.ShipRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Leon on 9/10/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShipRepositoryIntegrationTest {

    @Autowired
    private ShipRepository shipRepository;

    @Test
    public void testFindAll() {
        List<Ship> shipList = shipRepository.findAll();
        MatcherAssert.assertThat(shipList.size(), Matchers.is(Matchers.greaterThanOrEqualTo(0)));
    }

}
