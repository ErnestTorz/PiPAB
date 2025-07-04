package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Wypozyczenie;

import java.util.List;

public interface WypozyczenieDao {
    List<Wypozyczenie> findAll();
    List<Wypozyczenie> findByStudentId(Long studentId);
}
