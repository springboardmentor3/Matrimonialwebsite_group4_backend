package com.infosys.MatrimonialWebApplication.entitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Setter
@Entity
@Table(name = "personal")
@Getter
@ToString
public class Personal {

//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
    @Id
    private Long rId;

    public Personal(Long rId, int age, int height, int weight, String bloodType, String about) {
        this.rId = rId;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.about = about;
    }

    private int age;
    private int height;
    private int weight;
    private String bloodType;
    private String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Personal(Long id, Long rId, int age, int height, int weight, String bloodType) {

        this.rId = rId;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
    }

    public Personal() {
    }
}


