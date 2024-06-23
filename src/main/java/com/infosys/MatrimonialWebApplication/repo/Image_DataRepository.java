package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Image_data;
import org.springframework.data.jpa.repository.JpaRepository;



public interface Image_DataRepository extends JpaRepository<Image_data,Long> {

    public Image_data findByImagedataId(Long imageDataId);
}
