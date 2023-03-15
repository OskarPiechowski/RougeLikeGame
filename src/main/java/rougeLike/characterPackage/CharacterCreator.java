package rougeLike.characterPackage;
import rougeLike.EntityPackage.HibernateUtil;
import rougeLike.EntityPackage.User;
import rougeLike.EntityPackage.UserCharacter;
import rougeLike.PlayerPackage.Action;
import rougeLike.characterPackage.specializations.ArcherClass;
import rougeLike.characterPackage.specializations.MageClass;
import rougeLike.characterPackage.specializations.SwordsmanClass;
import rougeLike.characterPackage.specializations.ThiefClass;

import javax.persistence.EntityManager;
import java.util.*;

public class CharacterCreator extends Action {
    static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
    CharacterSpecChoice characterSpecChoice = new CharacterSpecChoice();
    SwordsmanClass swordsmanClass = new SwordsmanClass("Swordsman");
    ArcherClass archerClass = new ArcherClass("Archer");
    MageClass mageClass = new MageClass("Mage");
    ThiefClass thiefClass = new ThiefClass("Thief");
    public CharacterCreator(String name) {
        super(name);
    }
    public static void addCharacterToDB(UserCharacter userCharacter) {
        em.getTransaction().begin();
        em.persist(userCharacter);
        em.getTransaction().commit();
    }
    public void addCharacter(){
        Scanner scan = new Scanner(System.in);
        em.getTransaction().begin();
        System.out.printf("Your character gender is: %s", em.createQuery("from User", User.class )
                .setMaxResults(2));
        em.getTransaction().commit();
        System.out.println("Insert the name of your character: ");
        String name = scan.nextLine();
        System.out.printf("Select the specialization from list: ");
        System.out.println(" ");
        List<Action> characterChoices = characterSpecChoice.getCharacterChoices();
        for (int i = 0; i < characterChoices.size(); i++) {
            System.out.printf("%d. %s", i + 1, characterChoices.get(i).getName());
        }
        System.out.println("\n Make a choice: ");
        int choice = scan.nextInt();
        if(choice == 1){
            swordsmanClass.addSwordsmanClass();
        } if(choice == 2){
            mageClass.addMageClass();
        } if(choice == 3){
            archerClass.addArcherClass();
        } if(choice == 4){
            thiefClass.addThiefClass();
        }
        addCharacterToDB(new UserCharacter(name, choice));
    }
}
