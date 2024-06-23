package com.infosys.MatrimonialWebApplication.entitites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="image_data")
public class Image_data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long imagedataId;
    private String name;
    private String description;

    @ManyToMany(fetch= FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name="product_images",
            joinColumns = { @JoinColumn(name="image_id")

            }, inverseJoinColumns = {
            @JoinColumn(name="imagedata_id")
    }
    )
    private Set<Image> images;

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }



    public Image_data() {
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

    public Image_data(Long imagedataId, String name, String description, Set<Image> images) {
        this.imagedataId = imagedataId;
        this.name = name;
        this.description = description;
        this.images = images;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Long getImagedataId() {
        return imagedataId;
    }

    public void setImagedataId(Long imagedataId) {
        this.imagedataId = imagedataId;
    }
}
