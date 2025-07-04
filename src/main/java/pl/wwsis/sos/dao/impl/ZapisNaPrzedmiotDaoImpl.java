package pl.wwsis.sos.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.wwsis.sos.dao.ZapisNaPrzedmiotDao;
import pl.wwsis.sos.model.ZapisNaPrzedmiot;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ZapisNaPrzedmiotDaoImpl implements ZapisNaPrzedmiotDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void zapiszStudenta(ZapisNaPrzedmiot zapis) {
        entityManager.persist(zapis);
    }

    @Override
    public void wypiszStudenta(Long studentId, Long przedmiotId) {
        entityManager.createQuery("DELETE FROM ZapisNaPrzedmiot z WHERE z.student.id = :studentId AND z.przedmiot.id = :przedmiotId")
                .setParameter("studentId", studentId)
                .setParameter("przedmiotId", przedmiotId)
                .executeUpdate();
    }

    @Override
    public List<ZapisNaPrzedmiot> findByStudent(Long studentId) {
        return entityManager.createQuery("SELECT z FROM ZapisNaPrzedmiot z WHERE z.student.id = :studentId", ZapisNaPrzedmiot.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }
}
