package pl.wwsis.sos.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import pl.wwsis.sos.dao.GrupaDao;
import pl.wwsis.sos.model.Grupa;

@Repository
@Transactional
public class GrupaDaoImpl implements GrupaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Grupa> pobierzWszystkieGrupy() {
        Query query = entityManager.createQuery("SELECT g FROM Grupa g");
        return query.getResultList();
    }

    @Override
    public Grupa pobierzGrupePoId(int id) {
        return entityManager.find(Grupa.class, id);
    }

    @Override
    public void dodajGrupe(Grupa grupa) {
        entityManager.persist(grupa);
    }

    @Override
    public void zaktualizujGrupe(Grupa grupa) {
        entityManager.merge(grupa);
    }

    @Override
    public void usunGrupe(int id) {
        Grupa grupa = entityManager.find(Grupa.class, id);
        if (grupa != null) {
            entityManager.remove(grupa);
        }
    }
}
