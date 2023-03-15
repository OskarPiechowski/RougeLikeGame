package rougeLike.characterPackage.specializations;

import rougeLike.EntityPackage.UserCharacter;
import rougeLike.PlayerPackage.Action;

public class MageClass extends Action {

UserCharacter userCharacter = new UserCharacter();
    public MageClass(String name) {
        super(name);
    }
    public void addMageClass(){
        userCharacter.setStrange(9);
        userCharacter.setVitality(18);
        userCharacter.setAgility(3);
        userCharacter.setDexterity(21);
        userCharacter.setIntelligence(29);
    }
}

