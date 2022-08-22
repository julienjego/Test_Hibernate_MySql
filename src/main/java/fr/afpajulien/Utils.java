package fr.afpajulien;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class Utils {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fr.afpajulien.immo");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void updateAppartPrice(int idAppart, int prixAppart) {
        Appart appart = entityManager.find(Appart.class, idAppart);
        EntityTransaction trans = entityManager.getTransaction();
        trans.begin();
        appart.setPrix(prixAppart);
        entityManager.persist(appart);
        trans.commit();
        System.out.println(appart);
    }

    public static void listAppart() {
        List<Appart> apparts = entityManager.createQuery("from Appart", Appart.class).getResultList();
        for (Appart appart : apparts) {
            System.out.println(appart);
        }
    }

    public static void createAppart(int nbrPieces, int prix, int surface, String noImm) {
        EntityTransaction trans = entityManager.getTransaction();
        trans.begin();
        Appart newAppart = new Appart(nbrPieces, prix, surface, noImm);
        entityManager.persist(newAppart);
        trans.commit();
    }

    public static void deleteAppartById(int idAppart) {
        Appart appart = entityManager.find(Appart.class, idAppart);
        EntityTransaction trans = entityManager.getTransaction();
        trans.begin();
        entityManager.remove(appart);
        trans.commit();
    }
}
