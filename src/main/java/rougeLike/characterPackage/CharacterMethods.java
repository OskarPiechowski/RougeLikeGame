package rougeLike.characterPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterMethods {

    public static void calculateDamage(){
        int max = 3;
        int min = 1;
        int rangeOfDamage = max - min;
        for (int i = 0; i < max; i++) {
            int random = (int) (Math.random() * rangeOfDamage) + min;

        }
    }
    public static void setCharacterSpecialization(){

        }
}
