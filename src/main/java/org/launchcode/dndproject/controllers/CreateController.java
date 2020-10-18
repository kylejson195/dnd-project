package org.launchcode.dndproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CreateController {


   // private static List<CreateChar> adventurers = new ArrayList<>();

    //Gives me somewhere to go once the form is complete


    @GetMapping("create/newHero")
    public String createForm(){
        return "create/createHero";
    }

    @PostMapping("newHero")
    public String createFormOne(Model model){
       model.addAttribute("adventurer", "Adventurer");
       return "create/newHero";
    }

}
