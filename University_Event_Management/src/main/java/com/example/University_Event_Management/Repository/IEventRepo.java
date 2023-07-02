package com.example.University_Event_Management.Repository;

import com.example.University_Event_Management.Model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {
    List<Event> findByDate (LocalDate date);
}
