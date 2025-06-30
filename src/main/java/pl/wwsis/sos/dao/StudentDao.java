package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;

import java.util.List;

public interface StudentDao {
    Student findById(Integer id);
    List<Student> findAll();
    void save(Student student);
    void delete(Integer id);
    void update(Student student);

    Student findByLogin(String login);
    boolean existsByEmail(String email);
    boolean existsByLogin(String login);
    Student findByEmail(String email);
}
