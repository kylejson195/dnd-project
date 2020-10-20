package org.launchcode.dndproject.controllers;

import org.launchcode.dndproject.data.AdvData;
import org.launchcode.dndproject.data.AdventurerRepository;
import org.launchcode.dndproject.models.Adventurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class CreateController {


    @Autowired
    private static AdventurerRepository adventurerRepository;


    @GetMapping("create/newHero")
    public String createForm(Model model){
        model.addAttribute(new Adventurer());
        return "create/createHero";
    }

    @PostMapping("newHero")
    public String createFormOne(@ModelAttribute @Valid Adventurer adventurer){
        AdvData.add(adventurer);
        return "create/newHero";
    }

}
