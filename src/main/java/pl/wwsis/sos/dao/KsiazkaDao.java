package pl.wwsis.sos.dao;

import java.util.List;

import pl.wwsis.sos.model.Ksiazka;

public interface KsiazkaDao {
    Ksiazka findById(Integer id);
    List<Ksiazka> findAll();
    void save(Ksiazka ksiazka);
    void delete(Integer id);
}
