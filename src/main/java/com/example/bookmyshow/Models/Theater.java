package com.example.bookmyshow.Models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity

@Table(name="theater")

public class Theater {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
private String name;
private String location;

@OneToMany(mappedBy = "theater",cascade = CascadeType.ALL )
     private List<TheaterSeat> theaterSeatList=new ArrayList<>();

}
