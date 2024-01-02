package com.gf.docker.simulation.controller;

import com.gf.docker.simulation.entity.Card;
import com.gf.docker.simulation.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Gianluca Ferruzzi
 * @version 1.0
 * @since 1/2/24
 */
@RestController

@RequiredArgsConstructor
public class HomeController {


    private final CardService service;

    @GetMapping("/hello")
    public String getWelocome(){
        return "arealo";
    }

    @GetMapping("/myCards")
    public List<Card> cards(){
        return service.getMyCards();
    }
}
