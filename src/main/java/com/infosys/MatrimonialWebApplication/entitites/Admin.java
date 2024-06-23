package com.infosys.MatrimonialWebApplication.entitites;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="admin")
public class Admin {
    @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminid;
    private Long adminpassword;
    private String name;
    private String email;

    public Admin() {
    }
    public Admin(Long adminid, Long adminpassword, String name, String email, String phone) {
        this.adminid = adminid;
        this.adminpassword = adminpassword;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        adminid = adminid;
    }

    public Long getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(Long adminpassword) {
        adminpassword = adminpassword;
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



    private String phone;

}
