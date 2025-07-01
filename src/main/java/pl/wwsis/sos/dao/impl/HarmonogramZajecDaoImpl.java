package pl.wwsis.sos.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.sos.dao.HarmonogramZajecDao;
import pl.wwsis.sos.model.HarmonogramZajec;

@Repository
@Transactional
public class HarmonogramZajecDaoImpl implements HarmonogramZajecDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HarmonogramZajec> pobierzWszystkieZajecia() {
        String jpql = "SELECT h FROM HarmonogramZajec h";
        return entityManager.createQuery(jpql, HarmonogramZajec.class).getResultList();
    }

    @Override
    public List<HarmonogramZajec> pobierzZajeciaDlaGrupy(int grupaId) {
        String jpql = "SELECT h FROM HarmonogramZajec h WHERE h.grupa.id = :grupaId";
        TypedQuery<HarmonogramZajec> query = entityManager.createQuery(jpql, HarmonogramZajec.class);
        query.setParameter("grupaId", grupaId);
        return query.getResultList();
    }

    @Override
    public List<HarmonogramZajec> pobierzZajeciaDlaWykladowcy(int wykladowcaId) {
        String jpql = "SELECT h FROM HarmonogramZajec h WHERE h.wykladowca.id = :wykladowcaId";
        TypedQuery<HarmonogramZajec> query = entityManager.createQuery(jpql, HarmonogramZajec.class);
        query.setParameter("wykladowcaId", wykladowcaId);
        return query.getResultList();
    }

    @Override
    public List<HarmonogramZajec> pobierzZajeciaNaDzien(String dzienTygodnia) {
        String jpql = "SELECT h FROM HarmonogramZajec h WHERE h.dzienTygodnia = :dzienTygodnia";
        TypedQuery<HarmonogramZajec> query = entityManager.createQuery(jpql, HarmonogramZajec.class);
        query.setParameter("dzienTygodnia", dzienTygodnia);
        return query.getResultList();
    }

    @Override
    public HarmonogramZajec pobierzZajeciaPoId(int id) {
        return entityManager.find(HarmonogramZajec.class, id);
    }

    @Override
    public void dodajZajecia(HarmonogramZajec zajecia) {
        entityManager.persist(zajecia);
    }

    @Override
    public void zaktualizujZajecia(HarmonogramZajec zajecia) {
        entityManager.merge(zajecia);
    }

    @Override
    public void usunZajecia(int id) {
        HarmonogramZajec zajecia = entityManager.find(HarmonogramZajec.class, id);
        if (zajecia != null) {
            entityManager.remove(zajecia);
        }
    }
}
