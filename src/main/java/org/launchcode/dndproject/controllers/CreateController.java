package org.launchcode.dndproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class CreateController {


   // private static List<CreateChar> adventurers = new ArrayList<>();

    //Gives me somewhere to go once the form is complete
    @RequestMapping(value="newHero", method= {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String createAdventurer(@RequestParam String advName, int advStr, int advDex, int advCon, int advInt, int advWis, int advCha){
        return "newHero";
    }

    @GetMapping("create/newHero")
    public String createForm(){
        return "create/createHero";
    }

}
