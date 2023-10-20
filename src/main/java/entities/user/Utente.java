package entities.user;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name="Utente")
public class Utente {
    @Id
    @GeneratedValue



    private UUID numeroTessera;
    private String firstName;
    private String lastName;
     private Date annoNascita;

    public UUID getNumeroTessera() {
        return numeroTessera;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(Date annoNascita) {
        this.annoNascita = annoNascita;
    }

    public Utente(UUID numeroTessera, String firstName, String lastName, Date annoNascita) {
        this.numeroTessera = numeroTessera;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annoNascita = annoNascita;
    }
}
