package rougeLike.gameEnginePackage;
import rougeLike.characterPackage.CharacterController;
import rougeLike.PlayerPackage.Action;
import rougeLike.PlayerPackage.Leave;

import java.util.List;
import java.util.Scanner;

import static rougeLike.gameEnginePackage.GameMethods.addUser;
import static rougeLike.gameEnginePackage.GameMethods.userLogIn;

public class GameController {

    Scanner scan = new Scanner(System.in);

    private GameSystem gameSystem = new GameSystem();

    private Leave leave = new Leave("Leave the Menu");

    CharacterController characterController = new CharacterController();


    public void start() {
        do {
            System.out.println("Please login or registrant to create your game character");
            printMenu();
            System.out.println(" ");
            selectAction(scan.nextInt());

        } while (gameSystem.isRunning());
    }

    public void printMenu() {
        List<Action> actions = gameSystem.getActions();
        for (int i = 0; i < actions.size(); i++) {
            System.out.printf(" %d. %s", i + 1, actions.get(i).getName());
        }
    }

    public int selectAction(int number) {
        if (number < 1 || number > gameSystem.howManyActions()) {
            System.out.println("There is not such action");
        }
        String actionResult = gameSystem.useAction(number - 1);
        System.out.println(actionResult);
        if (number == 1) {
            addUser();
            characterController.printCharacterMenu();
        }
        if (number == 2) {
            userLogIn();
            characterController.printCharacterMenu();
        }
        if (number == 3) {
            leave.Leave();
        }
        return number;
    }
}

