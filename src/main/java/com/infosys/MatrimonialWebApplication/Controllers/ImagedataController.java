package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.ImagedataService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.Image;
import com.infosys.MatrimonialWebApplication.entitites.Image_data;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/image")
@CrossOrigin("*")
public class ImagedataController {

    @Autowired
    private ImagedataService imagedataService;

    @PostMapping(value = "/",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public Image_data createImage_data(@RequestPart("image_data") Image_data image_data,
                                       @RequestPart("imageFile")MultipartFile[] file) throws Exception {
//        return this.imagedataService.createImage_data(image_data);
        try{
            Set<Image> images = uploadImage(file);
            image_data.setImages(images);
           return  imagedataService.createImage_data(image_data);

        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;

        }

    }

    public Set<Image> uploadImage(MultipartFile[] multipartFiles) throws IOException {
        Set<Image> images = new HashSet<>();
        for(MultipartFile file : multipartFiles){
            Image image = new Image(
                    file.getOriginalFilename(),
                    file.getContentType(),
                    file.getBytes()
            );
            images.add(image);
        }
        return images;
    }




}
