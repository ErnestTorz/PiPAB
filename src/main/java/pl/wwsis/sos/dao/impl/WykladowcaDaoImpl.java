package pl.wwsis.sos.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.wwsis.sos.dao.WykladowcaDao;
import pl.wwsis.sos.model.Wykladowca;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class WykladowcaDaoImpl implements WykladowcaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Wykladowca> getAllWykladowcy() {
        return entityManager.createQuery("SELECT w FROM Wykladowca w", Wykladowca.class).getResultList();
    }

    @Override
    public Wykladowca findById(Long id) {
        return entityManager.find(Wykladowca.class, id);
    }
}
