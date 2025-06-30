package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.PrzedmiotDao;
import pl.wwsis.sos.model.Przedmiot;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PrzedmiotDaoImpl implements PrzedmiotDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Przedmiot findById(Long id) {
        return entityManager.find(Przedmiot.class, id);
    }

    @Override
    public List<Przedmiot> findAll() {
        return entityManager.createQuery("SELECT p FROM Przedmiot p", Przedmiot.class).getResultList();
    }

    @Override
    public void save(Przedmiot przedmiot) {
        entityManager.persist(przedmiot);
    }

    @Override
    public void delete(Long id) {
        Przedmiot przedmiot = entityManager.find(Przedmiot.class, id);
        if (przedmiot != null) {
            entityManager.remove(przedmiot);
        }
    }
}