package rougeLike.characterPackage;

import rougeLike.PlayerPackage.Action;
import rougeLike.PlayerPackage.Leave;

import java.util.List;
import java.util.Scanner;



public class CharacterController {

    Leave leave = new Leave("Log out");
    CharacterMenu characterMenu = new CharacterMenu();

   CharacterCreator characterCreator = new CharacterCreator("Create character");

public void printCharacterMenu(){

List<Action> characterMenuActions = characterMenu.getActions();
    for (int i = 0; i < characterMenuActions.size(); i++) {
        System.out.printf(" %d, %s", i + 1, characterMenuActions.get(i).getName());
    }
    System.out.println("\n Make a choice: ");
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    if(choice == 1){
        System.out.println("Create character");
        characterCreator.addCharacter();
    } if(choice == 2){
        System.out.println("Select character from list: ");
    } if(choice == 3){
        System.out.println("select and delete character");
    } if(choice == 4){
        leave.Leave();
    }
}
}
