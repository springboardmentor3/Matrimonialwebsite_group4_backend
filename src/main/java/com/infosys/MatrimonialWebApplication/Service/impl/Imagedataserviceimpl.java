package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.ImagedataService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class Imagedataserviceimpl implements ImagedataService {

    @Autowired
    private Image_DataRepository image_dataRepository;

    @Override
    public Image_data createImage_data (Image_data image_data) throws Exception {
        Image_data local =  this.image_dataRepository. findByImagedataId(image_data.getImagedataId());
        if(local!=null){
            System.out.println("User already present");
            throw new Exception("User already exists");
        }else{
            local =  image_dataRepository.save(image_data);
        }
        return local;
    }


}

