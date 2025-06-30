package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.StudentDao;
import pl.wwsis.sos.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student findById(Long id) {
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
    public void delete(Long id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
        }
    }
}
