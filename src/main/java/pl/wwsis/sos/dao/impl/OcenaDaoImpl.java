package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.OcenaDao;
import pl.wwsis.sos.model.Ocena;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class OcenaDaoImpl implements OcenaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Ocena findById(Long id) {
        return entityManager.find(Ocena.class, id);
    }

    @Override
    public List<Ocena> findAll() {
        return entityManager.createQuery("SELECT o FROM Ocena o", Ocena.class).getResultList();
    }

    @Override
    public void save(Ocena ocena) {
        entityManager.persist(ocena);
    }

    @Override
    public void delete(Long id) {
        Ocena ocena = entityManager.find(Ocena.class, id);
        if (ocena != null) {
            entityManager.remove(ocena);
        }
    }
}
