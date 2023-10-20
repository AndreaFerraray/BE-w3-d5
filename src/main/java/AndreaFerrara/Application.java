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
            UUID uuidDaCercare = UUID.fromString("3cbd735c-3463-4677-96b0-ad40cbd48f6d");
            Book libroTrovato = BookDAO.findBookById(  uuidDaCercare);
            System.out.println("il libro è" + libroTrovato);



            UUID uuidDaCercato = UUID.fromString("3cbd735c-3463-4677-96b0-ad40cbd48f6d");
            Book libroCancellato = BookDAO.findAndDeleteBookById(uuidDaCercato);

            if (libroCancellato != null) {
                System.out.println("Libro cancellato: " + libroCancellato.getTitolo());
            } else {
                System.out.println("Nessun libro trovato con quell'UUID.");
            }


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
