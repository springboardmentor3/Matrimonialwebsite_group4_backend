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
import java.util.Set;

@Entity
@Table(name="replies")
@Getter
@Setter

@ToString
public class Reply {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rid;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Reply(Long id, String email, String name, Date date, Time time, String message) {
        this.rid = id;
        this.email = email;
        this.name = name;
        this.date = date;
        this.time = time;
        this.message = message;
    }

    private String email;
    private String name;
    private Date date;

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    private Time time;
    private String message;

    public boolean isNew() {
        return isNew;
    }

    public void setisNew(boolean isNew) {
        isNew = isNew;
    }

    public Reply(Long id, String email, String name, Date date, Time time, String message, boolean isNew) {
        this.rid = id;
        this.email = email;
        this.name = name;
        this.date = date;
        this.time = time;
        this.message = message;
        this.isNew = isNew;
    }

    private boolean isNew;



    public Long getId() {
        return rid;
    }

    public void setId(Long id) {
        this.rid = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }



    public Reply() {
    }




}
