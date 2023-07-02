package com.example.University_Event_Management.Service;

import com.example.University_Event_Management.Model.Department;
import com.example.University_Event_Management.Model.Student;
import com.example.University_Event_Management.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo ;
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student added Successfully";
    }


    public String updateStudentDepartmentById(Integer id, Department department) {
        Optional<Student> student = studentRepo.findById(id);
        Student student1 = null ;
        if(student.isPresent()){
            student1 = student.get() ;
        }
        else {
            return "Id not found" ;
        }
        student1.setDepartment(department);
        studentRepo.save(student1);
        return "Student Department Updated Successfully";
    }

    public String deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
        return "Student deleted Successfully" ;
    }

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Integer id) {
        Optional<Student> optionalStudent = studentRepo.findById(id);
        return optionalStudent ;
    }
}
