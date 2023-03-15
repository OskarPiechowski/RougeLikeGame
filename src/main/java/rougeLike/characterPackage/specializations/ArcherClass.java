package rougeLike.characterPackage.specializations;

import rougeLike.EntityPackage.User;
import rougeLike.EntityPackage.UserCharacter;
import rougeLike.PlayerPackage.Action;

public class ArcherClass extends Action {

UserCharacter userCharacter = new UserCharacter();

    public ArcherClass(String name) {
        super(name);
    }
    public void addArcherClass(){
        userCharacter.setStrange(7);
        userCharacter.setVitality(19);
        userCharacter.setAgility(22);
        userCharacter.setDexterity(25);
        userCharacter.setIntelligence(7);
    }
}

