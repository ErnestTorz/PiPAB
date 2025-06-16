package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Grupa")
public class Grupa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grupa_id")
    private Integer id;

    @Column(length = 25)
    private String nazwa;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }
}
