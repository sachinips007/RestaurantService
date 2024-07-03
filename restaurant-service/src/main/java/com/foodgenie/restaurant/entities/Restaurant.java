package com.foodgenie.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity //Used to represent a table that'll be stored in DB
@Table //Used to specify database table that the entity will be mapped to in DB
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //To automatically generate the primary keys based on mandatory param strategy=generationtype
    private int Id;
    private String Name;
    private String Address;
    private Enum Status;
    private int Contact;
}
