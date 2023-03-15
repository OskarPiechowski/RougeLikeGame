package rougeLike.EntityPackage;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args){
        EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();
    }
}
