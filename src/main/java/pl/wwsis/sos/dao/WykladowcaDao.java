package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Wykladowca;

import java.util.List;

public interface WykladowcaDao {
    List<Wykladowca> getAllWykladowcy();
    Wykladowca findById(Long id);
}
