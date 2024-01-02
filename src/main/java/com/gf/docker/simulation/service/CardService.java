package com.gf.docker.simulation.service;

import com.gf.docker.simulation.entity.Card;
import com.gf.docker.simulation.repo.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gianluca Ferruzzi
 * @version 1.0
 * @since 1/2/24
 */
@Service
@RequiredArgsConstructor
public class CardService {


    private final CardRepository repo;

    public List<Card> getMyCards(){
        return  repo.findAll();
    }
}
