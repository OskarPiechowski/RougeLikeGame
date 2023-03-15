package rougeLike.characterPackage.specializations;

import rougeLike.EntityPackage.UserCharacter;
import rougeLike.PlayerPackage.Action;

public class ThiefClass extends Action {

UserCharacter userCharacter = new UserCharacter();

    public ThiefClass(String name) {
        super(name);
    }
    public void addThiefClass(){
        userCharacter.setStrange(18);
        userCharacter.setVitality(20);
        userCharacter.setAgility(18);
        userCharacter.setDexterity(19);
        userCharacter.setIntelligence(5);
    }
}

