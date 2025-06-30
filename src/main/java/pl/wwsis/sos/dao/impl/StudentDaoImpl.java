package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.StudentDao;
import pl.wwsis.sos.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

     @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void delete(Integer id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
        }
    }

      @Override
    public Student findByLogin(String login) {
        try {
            return entityManager.createQuery("SELECT s FROM Student s WHERE s.login = :login", Student.class)
                    .setParameter("login", login)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public boolean existsByEmail(String email) {
        Long count = entityManager.createQuery("SELECT COUNT(s) FROM Student s WHERE s.email = :email", Long.class)
                .setParameter("email", email)
                .getSingleResult();
        return count > 0;
    }

    @Override
    public boolean existsByLogin(String login) {
        Long count = entityManager.createQuery("SELECT COUNT(s) FROM Student s WHERE s.login = :login", Long.class)
                .setParameter("login", login)
                .getSingleResult();
        return count > 0;
    }

    @Override
    public Student findByEmail(String email) {
        try {
            return entityManager.createQuery("SELECT s FROM Student s WHERE s.email = :email", Student.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}

    

