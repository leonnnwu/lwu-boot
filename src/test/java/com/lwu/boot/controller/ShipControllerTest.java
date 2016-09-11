package com.lwu.boot.controller;

import com.lwu.boot.model.Ship;
import com.lwu.boot.repository.ShipRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Created by Leon on 9/10/16.
 */
public class ShipControllerTest {

    @InjectMocks
    private ShipController shipController;

    @Mock
    private ShipRepository shipRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGet() throws Exception {
        Ship ship = new Ship();
        ship.setId(1L);
        Mockito.when(shipRepository.findOne(1L)).thenReturn(ship);

        Ship shipExpected = shipController.get(1L);

        Mockito.verify(shipRepository).findOne(1L);

//        Assert.assertEquals(1L, ship.getId().longValue());
        MatcherAssert.assertThat(shipExpected.getId(), Matchers.is(1L));
    }
}