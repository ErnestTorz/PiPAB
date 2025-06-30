package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Przedmiot;

import java.util.List;

public interface PrzedmiotDao {
    Przedmiot findById(Long id);
    List<Przedmiot> findAll();
    void save(Przedmiot przedmiot);
    void delete(Long id);
}