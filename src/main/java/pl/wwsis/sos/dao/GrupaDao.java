package pl.wwsis.sos.dao;

import java.util.List;

import pl.wwsis.sos.model.Grupa;

public interface GrupaDao {
    List<Grupa> pobierzWszystkieGrupy();
    Grupa pobierzGrupePoId(int id);
    void dodajGrupe(Grupa grupa);
    void zaktualizujGrupe(Grupa grupa);
    void usunGrupe(int id);
}
