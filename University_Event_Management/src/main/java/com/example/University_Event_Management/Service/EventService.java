package com.example.University_Event_Management.Service;

import com.example.University_Event_Management.Model.Event;
import com.example.University_Event_Management.Repository.IEventRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo ;
    public String addEvent(Event event) {
        eventRepo.save(event);
        return "Event Added Successfully" ;
    }

    public String updateEventById(Integer id, Event event) {
        Optional<Event> event1 = eventRepo.findById(id);
        Event event2 = null ;
        if(event1.isPresent()){
            event2 = event1.get() ;
        }
        else{
            return  "Event id not found" ;
        }
        eventRepo.save(event);
        return "Event updated successfully";
    }

    public String deleteEventById(Integer id) {
        eventRepo.deleteById(id);
        return  "Event Deleted Successfully";
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return eventRepo.findByDate(date);

    }

    public Iterable<Event> getAllEvent() {
        return eventRepo.findAll();
    }
}
