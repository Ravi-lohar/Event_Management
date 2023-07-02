package com.example.University_Event_Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Event {
    @Id
    @NotNull(message = "Event id can not be empty")
    private Integer eventId ;
    @Size(min = 1 , max = 50)
    @NotBlank(message = "EventName Required")
    private String eventName ;
    @Size(min = 1 , max = 50)
    @NotBlank(message =  "Location of Event is Required")
    private String locationOfEvent ;
    private LocalDate date ;
    private LocalTime startTime ;
    private LocalTime endTime ;



}
