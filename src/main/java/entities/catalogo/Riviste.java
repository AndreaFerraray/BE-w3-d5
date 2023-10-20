package entities.catalogo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="Riviste ")
public class Riviste {

    @Id
    @GeneratedValue
    private UUID id;
    private String titolo;
    private long annoPubblicazione;

    private long numeroPagine;

private Date periodicità;



    public Date getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Date periodicità) {
        this.periodicità = periodicità;
    }

    public UUID getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public long getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(long annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public long getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(long numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
    public Riviste(UUID id, String titolo, long annoPubblicazione, long numeroPagine, Date periodicità) {
        this.id = id;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.periodicità = periodicità;
    }
}

