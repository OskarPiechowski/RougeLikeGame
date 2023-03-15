package rougeLike.StartScreenPackage;

import rougeLike.PlayerPackage.Action;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {


    private final List<Action> actions = new ArrayList<>();

    public MainMenu() {
        actions.add(new Action("Registration"));
        actions.add(new Action("Log in"));
        actions.add(new Action("Leave"));
    }

    public List<Action> getActions() {
        return actions;
    }

    public Action findActionByNumber(int number) {
        return actions.get(number);
    }

}