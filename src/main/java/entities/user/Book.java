package entities.user;


import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Book")
public class Book {

    @Id

    private UUID id;@GeneratedValue(generator = "UUID")



    private String titolo;
    private long annoPubblicazione;

    private long numeroPagine;
    private String autore;
    private String genere;

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

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Book(UUID id, String titolo, long annoPubblicazione, long numeroPagine, String autore, String genere) {
        this.id = id;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.autore = autore;
        this.genere = genere;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
