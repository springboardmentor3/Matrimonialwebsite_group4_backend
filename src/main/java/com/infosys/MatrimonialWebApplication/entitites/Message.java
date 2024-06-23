package com.infosys.MatrimonialWebApplication.entitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;

@Entity
@Table(name="message")
@Getter
@Setter
@ToString
public class Message  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long sendrid;
    private Long recrid;
    private String message;
    private String Place;
    @Enumerated(EnumType.STRING)
    private YesNo ApprovedStatus;

    public enum YesNo {
        YES, NO
    }



    private Date date;
    private Time time;
    public void setSendrid(Long send_rid) {
        this.sendrid = send_rid;
    }


    public Long getRecrid() {
        return recrid;
    }

    public void setRecrid(Long recrid) {
        this.recrid = recrid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }



    public YesNo getApprovedStatus() {
        return ApprovedStatus;
    }

    public void setApprovedStatus(YesNo approvedStatus) {
        ApprovedStatus = approvedStatus;
    }

    public Message(Long id, Long send_rid, Long recrid, String message, String place, YesNo approvedStatus, Date date, Time time) {
        this.id = id;
        this.sendrid = send_rid;
        this.recrid = recrid;
        this.message = message;
        this.Place = place;
        this.ApprovedStatus = approvedStatus;
        this.date = date;
        this.time = time;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSend_rid() {
        return sendrid;
    }

    public void setSend_rid(long send_rid) {
        this.sendrid = send_rid;
    }

    public long getRec_rid() {
        return recrid;
    }

    public void setRec_rid(long rec_rid) {
        this.recrid = rec_rid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public Message() {
    }





}




