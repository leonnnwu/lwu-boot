package com.lwu.boot.repository;

import com.lwu.boot.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Leon on 9/10/16.
 */
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
