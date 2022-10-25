package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name= "students")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "student`FirstName")
    private String firstName;
    @Column(name= "studentLastName")
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
   // @Enumerated(EnumType.ORDINAL) numeric type - "ORDINAL"
    private Gender gender;

    @Transient //if you don't want to see city table
  private String city;
}
