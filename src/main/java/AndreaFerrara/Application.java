package AndreaFerrara;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BE-w3-d5");
    public static void main(String[] args) {


        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
    }
}
