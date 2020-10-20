package org.launchcode.dndproject.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Adventurer extends AbstractEntity {

    @NotBlank(message= "Please name your Adventurer!")
    private String advName;

    private int advStr;
    private int advDex;
    private int advCon;
    private int advInt;
    private int advWis;
    private int advCha;

    private enum Class {

        BARBARIAN,
        BARD,
        CLERIC,
        DRUID,
        FIGHTER,
        MONK,
        PALADIN,
        RANGER,
        ROGUE,
        SORCERER,
        WARLOCK,
        WIZARD

    }

    private enum Race {

        DRAGONBORN,
        DWARF,
        ELF,
        GNOME,
        HALFELF,
        HALFLING,
        ORC,
        HUMAN,
        TIEFLING,


    }

    public Adventurer(String advName, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        this.advName = advName;
        this.advStr = strength;
        this.advDex= dexterity;
        this.advCon = constitution;
        this.advInt = intelligence;
        this.advWis = wisdom;
        this.advCha = charisma;
    }

    public Adventurer(){
    };

    public int getAdvStr() {
        return advStr;
    }

    public void setAdvStr(int advStr) {
        this.advStr = advStr;
    }

    public int getAdvDex() {
        return advDex;
    }

    public void setAdvDex(int advDex) {
        this.advDex = advDex;
    }

    public int getAdvCon() {
        return advCon;
    }

    public void setAdvCon(int advCon) {
        this.advCon = advCon;
    }

    public int getAdvInt() {
        return advInt;
    }

    public void setAdvInt(int advInt) {
        this.advInt = advInt;
    }

    public int getAdvWis() {
        return advWis;
    }

    public void setAdvWis(int advWis) {
        this.advWis = advWis;
    }

    public int getAdvCha() {
        return advCha;
    }

    public void setAdvCha(int advCha) {
        this.advCha = advCha;
    }

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }

    @Override
    public String toString() {
        return advName;
    }
}
