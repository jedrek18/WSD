package com.example.demo.Model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Component("person")
@Entity
@Table(name = "Person")
public class Person {
    @Column(name = "id")
    int id;
    @Column(name = "fistName")
    String fistName;
    @Column(name = "secondName")
    String secondName;
    @Column(name = "bornDate")
    Date bornDate;
    @Column(name = "pesel")
    String pesel;

    public Person() {
    }

    public String getFistName() {
        return fistName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public String getPesel() {
        return pesel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }


    public Person(int id, String fistName, String secondName, Date bornDate, String pesel) {
        this.id = id;
        this.fistName = fistName;
        this.secondName = secondName;
        this.bornDate = bornDate;
        this.pesel = pesel;

    }
}
