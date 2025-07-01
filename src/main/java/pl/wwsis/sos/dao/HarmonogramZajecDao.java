package pl.wwsis.sos.dao;

import java.util.List;

import pl.wwsis.sos.model.HarmonogramZajec;

public interface HarmonogramZajecDao {

    List<HarmonogramZajec> pobierzWszystkieZajecia();

    List<HarmonogramZajec> pobierzZajeciaDlaGrupy(int grupaId);

    List<HarmonogramZajec> pobierzZajeciaDlaWykladowcy(int wykladowcaId);

    List<HarmonogramZajec> pobierzZajeciaNaDzien(String dzienTygodnia);

    HarmonogramZajec pobierzZajeciaPoId(int id);

    void dodajZajecia(HarmonogramZajec zajecia);

    void zaktualizujZajecia(HarmonogramZajec zajecia);

    void usunZajecia(int id);
}
