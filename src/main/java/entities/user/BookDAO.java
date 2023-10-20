package entities.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.UUID;


public class BookDAO {
    private static EntityManager em;

    public BookDAO(EntityManager em) {
        this.em = em;
    }

    public static Book findAndDeleteBookById(UUID uuidDaCercato) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        Book bookToDelete = em.find(Book.class, uuidDaCercato);
        if (bookToDelete != null) {
            em.remove(bookToDelete);
    }
        transaction.commit();

        return bookToDelete;

    }


    public void save(Book book) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(book);
        transaction.commit();
        System.out.println("Salvato correttamente nuovo libro");
    }

    public static Book findBookById(UUID bookId) {
        return em.find(Book.class, bookId);
    }



    public  class BookDAOSubclass {
    private EntityManager em = null;

    public BookDAOSubclass(){

    }




}


    };
