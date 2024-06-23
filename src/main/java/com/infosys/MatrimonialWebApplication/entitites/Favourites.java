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
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="favourites")
@Getter
@Setter

@ToString
public class Favourites  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long recrid;
    private Long  sendrid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Favourites() {
    }

    public Favourites(Long id, Long recrid, Long sendrid, String name, String email, String phone) {
        this.id = id;
        this.recrid = recrid;
        this.sendrid = sendrid;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getRecrid() {
        return recrid;
    }

    public void setRecrid(Long recrid) {
        this.recrid = recrid;
    }

    public Long getSendrid() {
        return sendrid;
    }

    public void setSendrid(Long sendrid) {
        this.sendrid = sendrid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;

    public Favourites(Long recrid, Long sendrid, String name, String email, String phone) {
        this.recrid = recrid;
        this.sendrid = sendrid;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    private String email;
    private String phone;






}
