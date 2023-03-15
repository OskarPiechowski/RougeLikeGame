package rougeLike.gameEnginePackage;

import rougeLike.Item;

public interface GameInteractions {
    boolean hasPlayerGotItem(Item item);

    void addItemToPlayer(Item item);

    void openDoor();

    void removeItemFromRoom(Item item);
}
