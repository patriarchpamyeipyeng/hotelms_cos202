package com.example.hotelMS.entities;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String roomNumber;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    private Double cost;
    @Enumerated(EnumType.STRING)
    private Status status;
    private boolean isOccupied =false;

    public Room(int id, String roomNumber, RoomType roomType, Double cost, Status status, boolean isOccupied) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.cost = cost;
        this.status = status;
        this.isOccupied = isOccupied;
    }

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomType=" + roomType +
                ", cost=" + cost +
                ", status=" + status +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
