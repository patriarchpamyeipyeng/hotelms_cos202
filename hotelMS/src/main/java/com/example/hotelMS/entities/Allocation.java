package com.example.hotelMS.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Allocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Guest guest;
    @ManyToOne
    private Room room;
    private LocalDate localDate;
    @OneToOne
    private Payment payment;

    public Allocation(int id, Guest guest, Room room, LocalDate localDate, Payment payment) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.localDate = localDate;
        this.payment = payment;
    }

    public Allocation() {
    }

    @Override
    public String toString() {
        return "Allocation{" +
                "id=" + id +
                ", guest=" + guest +
                ", room=" + room +
                ", localDate=" + localDate +
                ", payment=" + payment +
                '}';
    }
}
