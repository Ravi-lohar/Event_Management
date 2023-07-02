package com.example.University_Event_Management.Controller;

import com.example.University_Event_Management.Model.Department;
import com.example.University_Event_Management.Model.Student;
import com.example.University_Event_Management.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Validated
public class StudentController {
    @Autowired
    StudentService studentService ;

    @PostMapping("student")
    public String addStudent(@Valid @RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("student/id/{id}/department/{department}")
    public String updateStudentDepartmentById( @PathVariable Integer id ,  @PathVariable Department department){
        return studentService.updateStudentDepartmentById(id , department);
    }

    @DeleteMapping("student/{id}")
    public String deleteStudentById(@Valid @PathVariable Integer id ){
        return studentService.deleteStudentById(id);
    }
    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("student/id/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

}