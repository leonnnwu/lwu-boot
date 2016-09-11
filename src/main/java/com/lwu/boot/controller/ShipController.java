package com.lwu.boot.controller;

import com.lwu.boot.model.Ship;
import com.lwu.boot.repository.ShipRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Leon on 9/5/16.
 */
@RestController
@RequestMapping("/api/v1/")
public class ShipController {

    @Autowired
    private ShipRepository shipRepository;

    @RequestMapping(value = "ship", method = RequestMethod.GET)
    public List<Ship> list() {
        return shipRepository.findAll();
    }

    @RequestMapping(value = "ship", method = RequestMethod.POST)
    public Ship create(@RequestBody Ship ship) {
        return shipRepository.saveAndFlush(ship);
    }

    @RequestMapping(value = "ship/{id}", method = RequestMethod.GET)
    public Ship get(@PathVariable Long id) {
        return shipRepository.findOne(id);
    }

    @RequestMapping(value = "ship/{id}", method = RequestMethod.PUT)
    public Ship update(@PathVariable Long id, @RequestBody Ship ship) {
        Ship existingShip = shipRepository.findOne(id);
        BeanUtils.copyProperties(ship, existingShip);
        return shipRepository.saveAndFlush(existingShip);
    }

    @RequestMapping(value = "ship/{id}", method = RequestMethod.DELETE)
    public Ship delete(@PathVariable Long id) {
        Ship existingShip = shipRepository.findOne(id);
        shipRepository.delete(existingShip);
        return existingShip;
    }
}
