package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Zapis_na_przedmiot")
public class ZapisNaPrzedmiot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zapis_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "przedmiot_id")
    private Przedmiot przedmiot;

    @Column(name = "data_zapisu")
    private LocalDate dataZapisu;

    private String status;

    @Column(name = "termin_rezygnacji")
    private LocalDate terminRezygnacji;

    @Column(name = "lista_rezerwowa")
    private Boolean listaRezerwowa;

    private Boolean zaliczone;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Przedmiot getPrzedmiot() { return przedmiot; }
    public void setPrzedmiot(Przedmiot przedmiot) { this.przedmiot = przedmiot; }

    public LocalDate getDataZapisu() { return dataZapisu; }
    public void setDataZapisu(LocalDate dataZapisu) { this.dataZapisu = dataZapisu; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getTerminRezygnacji() { return terminRezygnacji; }
    public void setTerminRezygnacji(LocalDate terminRezygnacji) { this.terminRezygnacji = terminRezygnacji; }

    public Boolean getListaRezerwowa() { return listaRezerwowa; }
    public void setListaRezerwowa(Boolean listaRezerwowa) { this.listaRezerwowa = listaRezerwowa; }

    public Boolean getZaliczone() { return zaliczone; }
    public void setZaliczone(Boolean zaliczone) { this.zaliczone = zaliczone; }
}