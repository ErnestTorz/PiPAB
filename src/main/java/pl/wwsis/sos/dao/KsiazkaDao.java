package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Ksiazka;

import java.util.List;

public interface KsiazkaDao {
    Ksiazka findById(Long id);
    List<Ksiazka> findAll();
    void save(Ksiazka ksiazka);
    void delete(Long id);
}
