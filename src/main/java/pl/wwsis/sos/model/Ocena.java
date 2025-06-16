package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Ocena")
public class Ocena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ocena_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "przedmiot_id")
    private Przedmiot przedmiot;

    @Column(name = "wartosc_oceny")
    private BigDecimal wartosc;

    private String komentarz;

    @Column(name = "typ_oceny")
    private String typ;

    @Column(name = "data_oceny")
    private LocalDate data;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Przedmiot getPrzedmiot() { return przedmiot; }
    public void setPrzedmiot(Przedmiot przedmiot) { this.przedmiot = przedmiot; }

    public BigDecimal getWartosc() { return wartosc; }
    public void setWartosc(BigDecimal wartosc) { this.wartosc = wartosc; }

    public String getKomentarz() { return komentarz; }
    public void setKomentarz(String komentarz) { this.komentarz = komentarz; }

    public String getTyp() { return typ; }
    public void setTyp(String typ) { this.typ = typ; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}