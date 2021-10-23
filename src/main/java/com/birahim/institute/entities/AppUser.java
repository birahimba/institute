package com.birahim.institute.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int uniqueID;
    private String firstname;
    private String lastName;
    private String email;
    private int NumberCall;
    private String location;
    private String gender;
}
