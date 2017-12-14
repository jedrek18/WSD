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

    public Permission(){

    }

    public Permission(Long id, PermType permType, Date effectiveDate, Date expiredDate, User ownerUser, Room room) {
        this.id = id;
        this.permType = permType;
        this.effectiveDate = effectiveDate;
        this.expiredDate = expiredDate;
        this.ownerUser = ownerUser;
        this.room = room;
    }

    @Id
    @Column(name = "ID_PERMISSION")
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

