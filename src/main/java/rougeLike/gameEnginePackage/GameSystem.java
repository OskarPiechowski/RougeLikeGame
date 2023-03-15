package rougeLike.gameEnginePackage;

import rougeLike.StartScreenPackage.MainMenu;
import rougeLike.PlayerPackage.Action;

import java.util.List;

public class GameSystem implements GameEngineInterface {

    MainMenu location = new MainMenu();
    public boolean running = true;

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public List<Action> getActions() {
        return location.getActions();
    }

    @Override
    public int howManyActions() {
        return getActions().size();
    }

    @Override
    public String useAction(int index) {
        Action action = location.findActionByNumber(index);
        return action.getName();
    }
}