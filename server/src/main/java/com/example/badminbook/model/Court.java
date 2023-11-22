package com.example.badminbook.model;

import jakarta.persistence.*;

@Entity
@Table(name = "court")
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courtId;

    public Court() {
    }

    public Court(Long courtId) {
        this.courtId = courtId;
    }

    public Long getCourtId() {
        return courtId;
    }

    public void setCourtId(Long courtId) {
        this.courtId = courtId;
    }

    @Override
    public String toString() {
        return "Court{" +
                "courtId=" + courtId +
                '}';
    }
}
