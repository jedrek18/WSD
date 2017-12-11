package com.example.WSD.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Room")
public class Room {

    Long id;
    RoomType roomType;
    String number;
    String location;

    public Room() {
    }

    public Room(Long id, RoomType roomType, String number, String location) {
        this.id = id;
        this.roomType = roomType;
        this.number = number;
        this.location = location;
    }

    @Id
    @Column(name = "ID_ROOM")
    public Long getId() {
        return id;
    }

    @Column(name = "TYPE")
    public RoomType getRoomType() {
        return roomType;
    }

    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

    @Column(name = "LOCATION")
    public String getLocation() {
        return location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
