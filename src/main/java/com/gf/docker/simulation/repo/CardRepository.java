package com.gf.docker.simulation.repo;

import com.gf.docker.simulation.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gianluca Ferruzzi
 * @version 1.0
 * @since 1/2/24
 */
public interface CardRepository extends JpaRepository<Card,Long> {
}
