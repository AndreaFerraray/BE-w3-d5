package entities.user;



import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Prestito")
public class Prestito {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "numeroTessera")
    private Utente utente;

    @OneToOne
    @JoinColumn(name = "book")
    private Book book;
    @OneToOne
    @JoinColumn(name = "riviste")
    private Riviste riviste;

    private Date dataPrestito;
    private Date dataRestituzione;

    public Prestito() {
    }

    public Long getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public Book getBook() {
        return book;
    }

    public Riviste getRiviste() {
        return riviste;
    }

    public void setRiviste(Riviste riviste) {
        this.riviste = riviste;
    }

    public Date getDataPrestito() {
        return dataPrestito;
    }

    public void setDataPrestito(Date dataPrestito) {
        this.dataPrestito = dataPrestito;
    }

    public Date getDataRestituzione() {
        return dataRestituzione;
    }

    public void setDataRestituzione(Date dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }

    public Prestito(Long id, Utente utente, Book book, Riviste riviste, Date dataPrestito, Date dataRestituzione) {
        this.id = id;
        this.utente = utente;
        this.book = book;
        this.riviste = riviste;
        this.dataPrestito = dataPrestito;
        this.dataRestituzione = dataRestituzione;
    }
    private boolean isDataRestituzioneValid() {
        if (dataPrestito != null && dataRestituzione != null) {
            long diffInMilliseconds = dataRestituzione.getTime() - dataPrestito.getTime();
            long diffInDays = diffInMilliseconds / (24 * 60 * 60 * 1000);
            return diffInDays == 30;
        }
        return true;
    }
};










