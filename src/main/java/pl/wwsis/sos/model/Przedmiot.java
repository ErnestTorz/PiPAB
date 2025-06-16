package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Przedmiot")
public class Przedmiot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "przedmiot_id")
    private Integer id;

    private String nazwa;

    @Column(name = "kod_przedmiotu")
    private String kodPrzedmiotu;

    private String opis;

    @Column(name = "liczba_miejsc")
    private Integer liczbaMiejsc;

    @Column(name = "forma_zaliczenia")
    private String formaZaliczenia;

    @Column(name = "punkty_ects")
    private Integer ects;

    @Column(name = "liczba_godzin")
    private Integer liczbaGodzin;

    @ManyToOne
    @JoinColumn(name = "wykladowca_id")
    private Wykladowca wykladowca;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }

    public String getKodPrzedmiotu() { return kodPrzedmiotu; }
    public void setKodPrzedmiotu(String kodPrzedmiotu) { this.kodPrzedmiotu = kodPrzedmiotu; }

    public String getOpis() { return opis; }
    public void setOpis(String opis) { this.opis = opis; }

    public Integer getLiczbaMiejsc() { return liczbaMiejsc; }
    public void setLiczbaMiejsc(Integer liczbaMiejsc) { this.liczbaMiejsc = liczbaMiejsc; }

    public String getFormaZaliczenia() { return formaZaliczenia; }
    public void setFormaZaliczenia(String formaZaliczenia) { this.formaZaliczenia = formaZaliczenia; }

    public Integer getEcts() { return ects; }
    public void setEcts(Integer ects) { this.ects = ects; }

    public Integer getLiczbaGodzin() { return liczbaGodzin; }
    public void setLiczbaGodzin(Integer liczbaGodzin) { this.liczbaGodzin = liczbaGodzin; }

    public Wykladowca getWykladowca() { return wykladowca; }
    public void setWykladowca(Wykladowca wykladowca) { this.wykladowca = wykladowca; }
}