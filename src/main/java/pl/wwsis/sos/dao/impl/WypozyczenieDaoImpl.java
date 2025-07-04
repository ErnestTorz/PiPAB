package pl.wwsis.sos.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.wwsis.sos.dao.WypozyczenieDao;
import pl.wwsis.sos.model.Wypozyczenie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class WypozyczenieDaoImpl implements WypozyczenieDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Wypozyczenie> findAll() {
        return entityManager.createQuery("SELECT w FROM Wypozyczenie w", Wypozyczenie.class).getResultList();
    }

    @Override
    public List<Wypozyczenie> findByStudentId(Long studentId) {
        return entityManager.createQuery(
                        "SELECT w FROM Wypozyczenie w WHERE w.student.id = :studentId", Wypozyczenie.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }
}
