package org.launchcode.dndproject.models;

import javax.persistence.Entity;

@Entity
public class Adventurer extends AbstractEntity {

    private String name;
    private int advStr;
    private int advDex;
    private int advCon;
    private int advInt;
    private int advWis;
    private int advCha;


    public Adventurer(){

    };


    public Adventurer(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        this.name= name;
        this.advStr = strength;
        this.advDex= dexterity;
        this.advCon = constitution;
        this.advInt = intelligence;
        this.advWis = wisdom;
        this.advCha = charisma;
    }


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
