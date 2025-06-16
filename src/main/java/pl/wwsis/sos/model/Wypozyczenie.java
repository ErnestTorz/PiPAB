package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Wypozyczenie")
public class Wypozyczenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wypozyczenie_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "ksiazka_id")
    private Ksiazka ksiazka;

    @Column(name = "data_wypozyczenia")
    private LocalDate dataWypozyczenia;

    @Column(name = "data_zwrotu")
    private LocalDate dataZwrotu;

    private String status;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Ksiazka getKsiazka() { return ksiazka; }
    public void setKsiazka(Ksiazka ksiazka) { this.ksiazka = ksiazka; }

    public LocalDate getDataWypozyczenia() { return dataWypozyczenia; }
    public void setDataWypozyczenia(LocalDate dataWypozyczenia) { this.dataWypozyczenia = dataWypozyczenia; }

    public LocalDate getDataZwrotu() { return dataZwrotu; }
    public void setDataZwrotu(LocalDate dataZwrotu) { this.dataZwrotu = dataZwrotu; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}