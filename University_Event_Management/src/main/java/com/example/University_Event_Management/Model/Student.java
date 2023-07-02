package com.example.University_Event_Management.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @NotNull(message = "Student id can not be empty")
    private Integer studentId ;
    @Size(min = 1 , max = 50)
    @Pattern(regexp = "^[A-Z].*$" , message = "First letter of Name must be capital")
    private String firstName ;
    @Size(min = 1 , max = 50)
    private String lastName ;
    @Min(value = 18 ,message = "Age must be greater than or equal to 18")
    @Max(value = 25 ,message = "Age must be less than or equal to 25")
    private Integer age ;
    @Enumerated(EnumType.STRING)
    private Department department ;
}
