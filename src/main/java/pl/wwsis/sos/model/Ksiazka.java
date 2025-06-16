package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Ksiazka")
public class Ksiazka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ksiazka_id")
    private Integer id;

    private String tytul;
    private String autor;

    @Column(name = "rok_wydania")
    private Integer rokWydania;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTytul() { return tytul; }
    public void setTytul(String tytul) { this.tytul = tytul; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public Integer getRokWydania() { return rokWydania; }
    public void setRokWydania(Integer rokWydania) { this.rokWydania = rokWydania; }
}