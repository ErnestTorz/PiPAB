package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Harmonogram_zajec")
public class HarmonogramZajec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zajecia_id")
    private Integer id;

    @Column(name = "dzien_tygodnia")
    private String dzienTygodnia;

    @Column(name = "godzina_rozpoczecia")
    private LocalTime godzinaRozpoczecia;

    @Column(name = "godzina_zakonczenia")
    private LocalTime godzinaZakonczenia;

    private String sala;

    @ManyToOne
    @JoinColumn(name = "grupa_id")
    private Grupa grupa;

    @ManyToOne
    @JoinColumn(name = "przedmiot_id")
    private Przedmiot przedmiot;

    @ManyToOne
    @JoinColumn(name = "wykladowca_id")
    private Wykladowca wykladowca;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDzienTygodnia() { return dzienTygodnia; }
    public void setDzienTygodnia(String dzienTygodnia) { this.dzienTygodnia = dzienTygodnia; }

    public LocalTime getGodzinaRozpoczecia() { return godzinaRozpoczecia; }
    public void setGodzinaRozpoczecia(LocalTime godzinaRozpoczecia) { this.godzinaRozpoczecia = godzinaRozpoczecia; }

    public LocalTime getGodzinaZakonczenia() { return godzinaZakonczenia; }
    public void setGodzinaZakonczenia(LocalTime godzinaZakonczenia) { this.godzinaZakonczenia = godzinaZakonczenia; }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public Grupa getGrupa() { return grupa; }
    public void setGrupa(Grupa grupa) { this.grupa = grupa; }

    public Przedmiot getPrzedmiot() { return przedmiot; }
    public void setPrzedmiot(Przedmiot przedmiot) { this.przedmiot = przedmiot; }

    public Wykladowca getWykladowca() { return wykladowca; }
    public void setWykladowca(Wykladowca wykladowca) { this.wykladowca = wykladowca; }
}
