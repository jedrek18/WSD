package com.example.WSD.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Permission")
public class Permission {

    Long id;
    PermType permType;
    Date effectiveDate;
    Date expiredDate;
    User ownerUser;
    Room room;
    Room roomOwner;

    public Permission(){

    }

    public Permission(Long id, PermType permType, Date effectiveDate, Date expiredDate, User ownerUser, Room room, Room roomOwner) {
        this.id = id;
        this.permType = permType;
        this.effectiveDate = effectiveDate;
        this.expiredDate = expiredDate;
        this.ownerUser = ownerUser;
        this.room = room;
        this.roomOwner = roomOwner;
    }

    @Id
    @Column(name = "ID_USER")
    public Long getId() {
        return id;
    }

    @Column(name = "PERM_TYPE")
    public PermType getPermType() {
        return permType;
    }

    @Column(name = "EFF_DT")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    @Column(name = "EX_DT")
    public Date getExpiredDate() {
        return expiredDate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USER", nullable = false, insertable = false, updatable = false)
    public User getOwnerUser() {
        return ownerUser;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ROOM", nullable = false, insertable = false, updatable = false)
    public Room getRoom() {
        return room;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_MAIN_ROOM", nullable = false, insertable = false, updatable = false)
    public Room getRoomOwner() {
        return roomOwner;
    }

    public void setRoomOwner(Room roomOwner) {
        this.roomOwner = roomOwner;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPermType(PermType permType) {
        this.permType = permType;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public void setOwnerUser(User ownerUser) {
        this.ownerUser = ownerUser;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

