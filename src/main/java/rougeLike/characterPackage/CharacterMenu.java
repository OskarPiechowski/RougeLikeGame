package rougeLike.characterPackage;

import rougeLike.PlayerPackage.Action;

import java.util.ArrayList;
import java.util.List;

public class CharacterMenu {

private final List<Action> actions = new ArrayList<>();

public CharacterMenu(){
    actions.add(new Action("Create character"));
    actions.add(new Action("Chose character"));
    actions.add(new Action("Delete character"));
    actions.add(new Action("Log out"));
    }

    public List<Action> getActions(){
    return actions;
    }
}
