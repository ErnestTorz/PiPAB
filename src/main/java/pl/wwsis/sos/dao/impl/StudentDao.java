package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;

import java.util.List;

public interface StudentDao {
    Student findById(Long id);
    List<Student> findAll();
    void save(Student student);
    void delete(Long id);
}
