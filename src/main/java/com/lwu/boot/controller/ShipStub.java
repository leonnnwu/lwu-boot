package com.lwu.boot.controller;

import com.lwu.boot.model.Ship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Leon on 9/5/16.
 */
public class ShipStub {
    private static Map<Long, Ship> wrecks = new HashMap<Long, Ship>();
    private static Long idIndex = 3L;

    //populate initial wrecks
    static {
        Ship a = new Ship(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
        wrecks.put(1L, a);
        Ship b = new Ship(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
        wrecks.put(2L, b);
        Ship c = new Ship(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
        wrecks.put(3L, c);
    }

    public static List<Ship> list() {
        return new ArrayList<Ship>(wrecks.values());
    }

    public static Ship create(Ship wreck) {
        idIndex += idIndex;
        wreck.setId(idIndex);
        wrecks.put(idIndex, wreck);
        return wreck;
    }

    public static Ship get(Long id) {
        return wrecks.get(id);
    }

    public static Ship update(Long id, Ship wreck) {
        wrecks.put(id, wreck);
        return wreck;
    }

    public static Ship delete(Long id) {
        return wrecks.remove(id);
    }

}
