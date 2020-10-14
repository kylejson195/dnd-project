package org.launchcode.dndproject.data;

import org.launchcode.dndproject.models.Adventurer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AdvData {

    private static Map<Integer, Adventurer> adventurers = new HashMap<>();

    public static Collection<Adventurer> getAll(){
        return adventurers.values();
    }

    public static void add(Adventurer adventurer) {
        adventurers.put(adventurer.getId(), adventurer);
    }

    public static Adventurer getById(Integer id) {
        return adventurers.get(id);
    }

    public static void remove(Integer id){
        if (adventurers.containsKey(id)) {
            adventurers.remove(id);
        }
    }

}
