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
@Table(name="education")
@Getter
@Setter
@ToString
public class Education  {

    @Id
    private Long rId;

    private String education_level;
    private String education_filed;

    public Education() {
    }

    public Education( Long rId, String education_level, String education_filed) {

        this.rId = rId;
        this.education_level = education_level;
        this.education_filed = education_filed;

    }



    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public String getEducation_filed() {
        return education_filed;
    }

    public void setEducation_filed(String education_filed) {
        this.education_filed = education_filed;
    }
}
