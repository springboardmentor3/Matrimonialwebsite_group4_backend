//package com.infosys.MatrimonialWebApplication.entitites;
//
//import jakarta.persistence.*;
//
//import java.sql.Date;
//import java.sql.Time;
//@Entity
//@Table(name="communication")
//
//
//public class Communication {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long Id;
//    private long send_rid;
//    private long rec_rid;
//    private String message;
//    private String Place;
//
//    private Date meeting_date;
//    private Time meeting_time;
//    public Communication() {
//    }
//
//    public Communication(long id, long send_rid, long rec_rid, String message, String place, Date meeting_date, Time meeting_time) {
//        Id = id;
//        this.send_rid = send_rid;
//        this.rec_rid = rec_rid;
//        this.message = message;
//        Place = place;
//        this.meeting_date = meeting_date;
//        this.meeting_time = meeting_time;
//    }
//
//    public long getId() {
//        return Id;
//    }
//
//    public void setId(long id) {
//        Id = id;
//    }
//
//    public long getSend_rid() {
//        return send_rid;
//    }
//
//    public void setSend_rid(long send_rid) {
//        this.send_rid = send_rid;
//    }
//
//    public long getRec_rid() {
//        return rec_rid;
//    }
//
//    public void setRec_rid(long rec_rid) {
//        this.rec_rid = rec_rid;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getPlace() {
//        return Place;
//    }
//
//    public void setPlace(String place) {
//        Place = place;
//    }
//
//    public Date getMeeting_date() {
//        return meeting_date;
//    }
//
//    public void setMeeting_date(Date meeting_date) {
//        this.meeting_date = meeting_date;
//    }
//
//    public Time getMeeting_time() {
//        return meeting_time;
//    }
//
//    public void setMeeting_time(Time meeting_time) {
//        this.meeting_time = meeting_time;
//    }
//
//
//
//}
