package com.example.bookmyshow.Models;

import com.example.bookmyshow.Enums.SeatType;
import jakarta.persistence.*;

@Entity


@Table(name="theater_seats")
public class TheaterSeat {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

 private String seatNo;
 private SeatType seatType;
 @ManyToOne
    @JoinColumn
    private Theater theater;


}
