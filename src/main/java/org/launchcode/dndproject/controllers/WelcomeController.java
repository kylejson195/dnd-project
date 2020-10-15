package org.launchcode.dndproject.controllers;

import org.launchcode.dndproject.data.AdvData;
import org.launchcode.dndproject.data.AdventurerRepository;
import org.launchcode.dndproject.models.Adventurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("welcome")
public class WelcomeController {


    @Autowired
    private static AdventurerRepository adventurerRepository;

    @GetMapping
    public String displayAllAdventurers(Model model) {
        model.addAttribute("title", "All Adventurers");
        model.addAttribute("adventurers", AdvData.getAll());
        return "welcome/index";
    }

    @GetMapping("create")
    public String createAdvForm(Model model){
        model.addAttribute("title", "Create Your Adventurer");
        model.addAttribute(new Adventurer());
        return "create/createHero";
    }

    @PostMapping("create")
    public String runCreateAdvForm(@ModelAttribute @Valid Adventurer newAdv,
                                   Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Your Adventurer");
            ;
            return "create/createHero";
        }

        AdvData.add(newAdv);
        return "redirect:";

    }

    @GetMapping("delete")
    public String displayDeleteAdvForm(Model model){
        model.addAttribute("title", "Delete Adventurer");
        model.addAttribute("adventurers", AdvData.getAll());
        return "welcome/delete";
    }


    @GetMapping("welcomeForm")
    public String welcomeForm(Model model) {
        model.addAttribute("title", "All Adventurers");
        return "welcome/welcomeForm";
    }


    @PostMapping("welcomeForm")
    public String welcomeFormOne(@ModelAttribute @Valid String advName,
                                 Errors errors, Model model) {
        model.addAttribute("title", "All Adventurers");
        model.addAttribute("advName", advName);
        System.out.println(advName);
        return "create/createHero";
    }
}
