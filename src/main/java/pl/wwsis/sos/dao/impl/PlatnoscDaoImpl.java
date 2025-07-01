package pl.wwsis.sos.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import pl.wwsis.sos.dao.PlatnoscDao;
import pl.wwsis.sos.model.Platnosc;

import java.util.List;

@Transactional
public class PlatnoscDaoImpl implements PlatnoscDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Platnosc> pobierzWszystkiePlatnosci() {
        Query query = entityManager.createQuery("SELECT p FROM Platnosc p");
        return query.getResultList();
    }

    @Override
    public Platnosc pobierzPlatnoscPoId(int id) {
        return entityManager.find(Platnosc.class, id);
    }

    @Override
    public void dodajPlatnosc(Platnosc platnosc) {
        entityManager.persist(platnosc);
    }

    @Override
    public void zaktualizujPlatnosc(Platnosc platnosc) {
        entityManager.merge(platnosc);
    }

    @Override
    public void usunPlatnosc(int id) {
        Platnosc platnosc = entityManager.find(Platnosc.class, id);
        if (platnosc != null) {
            entityManager.remove(platnosc);
        }
    }

    @Override
    public List<Platnosc> pobierzPlatnosciDlaStudenta(int studentId) {
        Query query = entityManager.createQuery("SELECT p FROM Platnosc p WHERE p.student.id = :studentId");
        query.setParameter("studentId", studentId);
        return query.getResultList();
    }

    @Override
    public List<Platnosc> pobierzPlatnosciPoStatusie(String status) {
        Query query = entityManager.createQuery("SELECT p FROM Platnosc p WHERE p.status = :status");
        query.setParameter("status", status);
        return query.getResultList();
    }
}
