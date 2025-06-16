package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    private String imie;
    private String nazwisko;

    @Column(unique = true)
    private String login;

    @Column(unique = true)
    private Integer indeks;

    @Column(unique = true)
    private String email;

    private String haslo;

    @Column(name = "token_reset_password")
    private String tokenResetPassword;

    @Column(name = "status_konta")
    private String statusKonta;

    @Column(name = "licznik_nieudanych_logowan")
    private Integer licznikNieudanychLogowan;

    @Column(name = "data_ostatniego_logowania")
    private LocalDateTime dataOstatniegoLogowania;

    @ManyToOne
    @JoinColumn(name = "grupa_id")
    private Grupa grupa;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getImie() { return imie; }
    public void setImie(String imie) { this.imie = imie; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public Integer getIndeks() { return indeks; }
    public void setIndeks(Integer indeks) { this.indeks = indeks; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getHaslo() { return haslo; }
    public void setHaslo(String haslo) { this.haslo = haslo; }

    public String getTokenResetPassword() { return tokenResetPassword; }
    public void setTokenResetPassword(String tokenResetPassword) { this.tokenResetPassword = tokenResetPassword; }

    public String getStatusKonta() { return statusKonta; }
    public void setStatusKonta(String statusKonta) { this.statusKonta = statusKonta; }

    public Integer getLicznikNieudanychLogowan() { return licznikNieudanychLogowan; }
    public void setLicznikNieudanychLogowan(Integer licznikNieudanychLogowan) { this.licznikNieudanychLogowan = licznikNieudanychLogowan; }

    public LocalDateTime getDataOstatniegoLogowania() { return dataOstatniegoLogowania; }
    public void setDataOstatniegoLogowania(LocalDateTime dataOstatniegoLogowania) { this.dataOstatniegoLogowania = dataOstatniegoLogowania; }

    public Grupa getGrupa() { return grupa; }
    public void setGrupa(Grupa grupa) { this.grupa = grupa; }
}