package models;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name= "Timecards")
@NamedQueries({
    @NamedQuery(
            name = "getAllTimecards",
            query = "SELECT e FROM Timecard AS e ORDER BY e.id DESC"
            ),
    @NamedQuery(
            name = "getTimecardsCount",
            query = "SELECT COUNT(e) FROM Timecard AS e"
            ),

})

@Entity
public class Timecard {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "Timecard_date", nullable = false)
    private Date Timecard_date;

    @Column(name = "Timecard_time", nullable = false)
    private Time Timecard_time;

    @Column(name = "started_at", nullable = false)
    private Timestamp started_at;

    @Column(name = "finished_at", nullable = false)
    private Timestamp finished_at;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getTimecard_date() {
        return Timecard_date;
    }

    public void setTimecard_date(Date Timecard_date) {
        this.Timecard_date = Timecard_date;
    }

    public Time getTimecard_time() {
        return Timecard_time;
    }

    public void setTimecard_time(Time Timecard_time) {
        this.Timecard_time = Timecard_time;
    }

    public Timestamp getStarted_at() {
        return started_at;
    }

    public void setStarted_at(Timestamp started_at) {
        this.started_at = started_at;
    }

    public Timestamp getFinished_at() {
        return finished_at;
    }

    public void setFinished_at(Timestamp finished_at) {
        this.finished_at = finished_at;
    }





}



