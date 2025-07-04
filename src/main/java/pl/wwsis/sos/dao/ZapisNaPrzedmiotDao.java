package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.ZapisNaPrzedmiot;

import java.util.List;

public interface ZapisNaPrzedmiotDao {
    void zapiszStudenta(ZapisNaPrzedmiot zapis);
    void wypiszStudenta(Long studentId, Long przedmiotId);
    List<ZapisNaPrzedmiot> findByStudent(Long studentId);
}
