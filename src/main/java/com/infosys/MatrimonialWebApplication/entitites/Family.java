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

@Entity
@Table(name="family")
@Getter
@Setter

@ToString

public class Family  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RId;

    private String family_status;
    private String family_Types;
    private String family_name;

    public Family() {
    }

    public Family( Long rId, String family_status, String family_Types, String family_name) {

        this.RId = rId;
        this.family_status = family_status;
        this.family_Types = family_Types;
        this.family_name = family_name;

    }


    public Long getrId() {
        return RId;
    }

    public void setrId(Long rId) {
        this.RId = rId;
    }

    public String getFamily_status() {
        return family_status;
    }

    public void setFamily_status(String family_status) {
        this.family_status = family_status;
    }

    public String getFamily_Types() {
        return family_Types;
    }

    public void setFamily_Types(String family_Types) {
        this.family_Types = family_Types;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }
}
