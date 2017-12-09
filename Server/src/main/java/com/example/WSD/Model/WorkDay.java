package com.example.WSD.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "mydb.workDay")
public class WorkDay {

    @Id
    @Column(name="id")
    int id;
    @Column(name="dateOfWork")
    Date dateOfWork;
    @Column(name="timeofWork")
    double timeofWork;
    @Column(name="salayPerHour")
    double salayPerHour;
    @Column(name="dailySalary")
    double dailySalary;

    public WorkDay() {
    }

    public WorkDay(int id,Date dateOfWork, double timeofWork, double salayPerHour, double dailySalary) {
        this.id = id;
        this.dateOfWork = dateOfWork;
        this.timeofWork = timeofWork;
        this.salayPerHour = salayPerHour;
        this.dailySalary = dailySalary;
    }

    public WorkDay(int id,Date dateOfWork, double timeofWork, double salayPerHour) {
        this.id = id;
        this.dateOfWork = dateOfWork;
        this.timeofWork = timeofWork;
        this.salayPerHour = salayPerHour;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfWork() {
        return dateOfWork;
    }

    public double getTimeofWork() {
        return timeofWork;
    }

    public double getSalayPerHour() {
        return salayPerHour;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfWork(Date dateOfWork) {
        this.dateOfWork = dateOfWork;
    }

    public void setTimeofWork(double timeofWork) {
        this.timeofWork = timeofWork;
    }

    public void setSalayPerHour(double salayPerHour) {
        this.salayPerHour = salayPerHour;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public void countDailySalary(){
        this.dailySalary = salayPerHour * (timeofWork);
    }
}
