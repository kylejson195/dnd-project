package org.launchcode.dndproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CreateController {


   // private static List<CreateChar> adventurers = new ArrayList<>();

    //Gives me somewhere to go once the form is complete
    @RequestMapping(value="newHero", method= {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String createAdventurer(@RequestParam String adventurer, int advStr, int advDex, int advCon, int advInt, int advWis, int advCha){
        return "Greetings, " + adventurer + "! " + "Let us take the first step towards your epic journey! \n " +
                "\n Are you happy with your attributes? " +
                "\n Strength: " + advStr +
                "\n Dexterity: " + advDex +
                "\n Constitution: " + advCon +
                "\n Intelligence: " + advInt +
                "\n Wisdom: " + advWis +
                "\n Charisma: " + advCha;
    }

    @GetMapping("newHero/create")
    public String createForm(){
        return "create/createHero";
    }

}
