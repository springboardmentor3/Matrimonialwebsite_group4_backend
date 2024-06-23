package com.infosys.MatrimonialWebApplication.entitites;

import jakarta.persistence.*;

@Entity
@Table(name="candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long candid;
    String name;
    String address;
    String phone;
    String email;

    public Long getCandid() {
        return candid;
    }

    public void setCandid(Long candid) {
        this.candid = candid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Candidate() {
    }

    public Candidate(Long candid, String name, String address, String phone, String email) {
        this.candid = candid;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
