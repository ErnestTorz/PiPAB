package pl.wwsis.sos.dao;

import java.util.List;

import pl.wwsis.sos.model.Platnosc;

public interface PlatnoscDao {
    List<Platnosc> pobierzWszystkiePlatnosci();
    Platnosc pobierzPlatnoscPoId(int id);
    void dodajPlatnosc(Platnosc platnosc);
    void zaktualizujPlatnosc(Platnosc platnosc);
    void usunPlatnosc(int id);
    List<Platnosc> pobierzPlatnosciDlaStudenta(int studentId);
    List<Platnosc> pobierzPlatnosciPoStatusie(String status);
}
