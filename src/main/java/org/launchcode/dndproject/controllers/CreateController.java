package org.launchcode.dndproject.controllers;

import org.launchcode.dndproject.data.AdventurerRepository;
import org.launchcode.dndproject.models.Adventurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CreateController {


    @Autowired
    private static AdventurerRepository adventurerRepository;


    @GetMapping("create/newHero")
    public String createForm(@ModelAttribute Adventurer adventurer){
        adventurerRepository.save(adventurer);
        return "create/createHero";
    }

    @PostMapping("newHero")
    public String createFormOne( @RequestParam Adventurer adventurer, Model model){

        return "create/newHero";
    }

}
