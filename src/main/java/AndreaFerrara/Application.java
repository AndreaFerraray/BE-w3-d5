package AndreaFerrara;




import entities.user.Book;
import entities.user.BookDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.UUID;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BE-w3-d5");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        try{


          BookDAO sd = new BookDAO(em);

            System.out.println("Hello World!");

            Book book = new Book(UUID.randomUUID(), "Harry", 2023, 300, "gino", "find");

            sd.save(book);
            Book bookFromDB=sd.findById(1);
            System.out.println(bookFromDB);

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            em.close();
            emf.close();
        }

    }


}
