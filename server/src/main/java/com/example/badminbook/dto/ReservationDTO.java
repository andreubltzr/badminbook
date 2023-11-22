package com.example.badminbook.dto;

import com.example.badminbook.model.Court;
import com.example.badminbook.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class ReservationDTO {
    private Long reservationId;
    private Date startTime;
    private Date endTime;
    private Date date;
    private User user;
    private Court court;
}
