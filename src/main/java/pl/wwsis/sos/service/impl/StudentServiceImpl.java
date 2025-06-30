package pl.wwsis.sos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wwsis.sos.dao.StudentDao;
import pl.wwsis.sos.model.Student;
import pl.wwsis.sos.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getStudentById(Long id) {
        return studentDao.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentDao.delete(id);
    }
}
