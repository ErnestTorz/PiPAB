package pl.wwsis.sos.service;

import pl.wwsis.sos.model.Student;
import java.util.List;

public interface StudentService {
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    void saveStudent(Student student);
    void deleteStudent(Long id);
}
