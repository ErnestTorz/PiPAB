package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.KsiazkaDao;
import pl.wwsis.sos.model.Ksiazka;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class KsiazkaDaoImpl implements KsiazkaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Ksiazka findById(Integer id) {
        return entityManager.find(Ksiazka.class, id);
    }

    @Override
    public List<Ksiazka> findAll() {
        return entityManager.createQuery("SELECT k FROM Ksiazka k", Ksiazka.class).getResultList();
    }

    @Override
    public void save(Ksiazka ksiazka) {
        entityManager.persist(ksiazka);
    }

    @Override
    public void delete(Integer id) {
        Ksiazka ksiazka = entityManager.find(Ksiazka.class, id);
        if (ksiazka != null) {
            entityManager.remove(ksiazka);
        }
    }
}
