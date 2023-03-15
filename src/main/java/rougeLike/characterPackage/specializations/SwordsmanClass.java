package rougeLike.characterPackage.specializations;

import rougeLike.EntityPackage.HibernateUtil;
import rougeLike.EntityPackage.UserCharacter;
import rougeLike.PlayerPackage.Action;

import javax.persistence.EntityManager;

public class SwordsmanClass extends Action {

    static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    UserCharacter userCharacter = new UserCharacter();

    public SwordsmanClass(String name){
        super(name);
    }

    public static void addContactToDB(UserCharacter userCharacter) {
        em.getTransaction().begin();
        em.persist(userCharacter);
        em.getTransaction().commit();
    }
    public void addSwordsmanClass(){
        userCharacter.setStrange(23);
        userCharacter.setVitality(20);
        userCharacter.setAgility(9);
        userCharacter.setDexterity(21);
        userCharacter.setIntelligence(7);

        addContactToDB(new UserCharacter(getName(), userCharacter.getSpecialization()));
    }

}
