package com.lwu.boot.controller;

import com.lwu.boot.model.Ship;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Leon on 9/5/16.
 */
@RestController
@RequestMapping("/api/v1/")
public class ShipController {

    @RequestMapping(value = "ship", method = RequestMethod.GET)
    public List<Ship> list() {
        return ShipStub.list();
    }

    @RequestMapping(value = "ship", method = RequestMethod.POST)
    public Ship create(@RequestBody Ship ship) {
        return ShipStub.create(ship);
    }

    @RequestMapping(value = "ship/{id}", method = RequestMethod.GET)
    public Ship get(@PathVariable Long id) {
        return ShipStub.get(id);
    }

    @RequestMapping(value = "ship/{id}", method = RequestMethod.PUT)
    public Ship update(@PathVariable Long id, @RequestBody Ship ship) {
        return ShipStub.update(id, ship);
    }

    @RequestMapping(value = "ship/{id}", method = RequestMethod.DELETE)
    public Ship delete(@PathVariable Long id) {
        return ShipStub.delete(id);
    }
}
