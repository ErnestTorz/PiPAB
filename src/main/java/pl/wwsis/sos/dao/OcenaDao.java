package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Ocena;

import java.util.List;

public interface OcenaDao {
    Ocena findById(Long id);
    List<Ocena> findAll();
    void save(Ocena ocena);
    void delete(Long id);
}
