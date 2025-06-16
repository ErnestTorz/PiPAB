package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Wykladowca")
public class Wykladowca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wykladowca_id")
    private Integer id;

    private String imie;
    private String nazwisko;

    @Column(unique = true)
    private String email;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getImie() { return imie; }
    public void setImie(String imie) { this.imie = imie; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
