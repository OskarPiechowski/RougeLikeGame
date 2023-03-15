package rougeLike.characterPackage;

import rougeLike.PlayerPackage.Action;
import rougeLike.characterPackage.specializations.ArcherClass;
import rougeLike.characterPackage.specializations.MageClass;
import rougeLike.characterPackage.specializations.SwordsmanClass;
import rougeLike.characterPackage.specializations.ThiefClass;

import java.util.ArrayList;
import java.util.List;

public class CharacterSpecChoice {

    private final List<Action> characterChoices = new ArrayList<>();

    public CharacterSpecChoice(){
        characterChoices.add(new SwordsmanClass(" Swordsman "));
        characterChoices.add(new MageClass(" Mage "));
        characterChoices.add(new ArcherClass(" Archer "));
        characterChoices.add(new ThiefClass(" Thief "));
    }
    public List<Action> getCharacterChoices(){
        return characterChoices;
    }
}
