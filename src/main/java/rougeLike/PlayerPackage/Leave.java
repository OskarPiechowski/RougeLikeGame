package rougeLike.PlayerPackage;

public class Leave extends Action{

    public Leave(String name) {
        super(name);
    }
    public void Leave(){
        System.out.println("Leaving the game...");
        System.exit(0);
    }
}
