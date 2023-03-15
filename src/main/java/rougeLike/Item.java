package rougeLike;


import rougeLike.gameEnginePackage.GameInteractions;

public abstract class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }
    public abstract String interact(GameInteractions gameInteractions);

    public String getName() {
        return name;
    }
}
