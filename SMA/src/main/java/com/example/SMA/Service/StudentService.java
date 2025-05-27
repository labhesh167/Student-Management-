package com.example.SMA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SMA.Model.Student;
import com.example.SMA.Repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student update(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student); 
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
