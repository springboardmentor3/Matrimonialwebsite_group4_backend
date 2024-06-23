package com.infosys.MatrimonialWebApplication.entitites;

import jakarta.persistence.*;

@Entity
@Table(name="images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageId;
    private String name;

    private String description;

    public Image() {
    }

    public Image( String name, String description, byte[] picByte) {

        this.name = name;
        this.description = description;
        this.picByte = picByte;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }

    @Column(length=50000000)
    private byte[] picByte;



}
