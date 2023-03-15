package rougeLike.characterPackage;

import java.util.ArrayList;
import java.util.List;

public enum CharacterSpecialization {

    SWORDSMAN(23,20,9,21,7),
    MAGE(9,18,3,21,29),
    ARCHER(7,19,22,25,7),
    THIEF(18,20,18,19,5);
    private int strange;
    private int vitality;
    private int agility;
    private int dexterity;
    private int intelligence;

    CharacterSpecialization(int strange, int vitality, int agility, int dexterity, int intelligence) {
        this.agility = agility;
        this.strange = strange;
        this.dexterity = dexterity;
        this.vitality = vitality;
        this.intelligence = intelligence;
    }
    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
