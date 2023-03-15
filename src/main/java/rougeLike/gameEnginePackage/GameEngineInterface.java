package rougeLike.gameEnginePackage;

import rougeLike.PlayerPackage.Action;

import java.util.List;

public interface GameEngineInterface {

    boolean isRunning();

    List<Action> getActions();

    int howManyActions();

    String useAction(int index);

}