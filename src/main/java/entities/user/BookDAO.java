package entities.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;




public class BookDAO {
    private EntityManager em;

    public BookDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Book book) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(book);
        transaction.commit();
        System.out.println("Salvato correttamente nuovo libro");
    }




    public  class BookDAOSubclass {
    private EntityManager em = null;

    public BookDAOSubclass(){

    }


    public Book findById(long id){
        return em.find(Book.class,id);
    }
    public Book findByIdAndDelete(long id) {
        Book found = em.find(Book.class, id);
        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();

        } else {
            System.out.println("lo studente con l'id" + id + "non è stato tovato");
        }

        return found;
    }
}


    };
