package com.example.University_Event_Management.Repository;

import com.example.University_Event_Management.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student , Integer> {

}
