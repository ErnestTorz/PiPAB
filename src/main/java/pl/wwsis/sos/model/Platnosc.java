package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Table(name = "Platnosc")
public class Platnosc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platnosc_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private BigDecimal kwota;
    private String status;

    @Column(name = "data_wplaty")
    private LocalDate dataWplaty;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public BigDecimal getKwota() { return kwota; }
    public void setKwota(BigDecimal kwota) { this.kwota = kwota; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getDataWplaty() { return dataWplaty; }
    public void setDataWplaty(LocalDate dataWplaty) { this.dataWplaty = dataWplaty; }
}