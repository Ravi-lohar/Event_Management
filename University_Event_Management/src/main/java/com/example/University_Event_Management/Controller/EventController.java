package com.example.University_Event_Management.Controller;

import com.example.University_Event_Management.Model.Event;
import com.example.University_Event_Management.Service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@Validated
public class EventController {
    @Autowired
    EventService eventService ;
    @PostMapping("event")
    public String addEvent(@Valid @RequestBody Event event){
        return eventService.addEvent(event);
    }
    @PutMapping("event/{id}")
    public String updateEventById(@PathVariable Integer id , @Valid @RequestBody Event event){
        return eventService.updateEventById(id , event);
    }
    @DeleteMapping("event/{id}")
    public String deleteEventById(@PathVariable Integer id){
        return eventService.deleteEventById(id);
    }
    @GetMapping("event/{date}")
    public List<Event> getAllEventsByDate(@PathVariable LocalDate date){
        return eventService.getAllEventsByDate(date);
    }

    @GetMapping("events")
    public Iterable<Event> getAllEvent(){
        return eventService.getAllEvent();
    }


}
