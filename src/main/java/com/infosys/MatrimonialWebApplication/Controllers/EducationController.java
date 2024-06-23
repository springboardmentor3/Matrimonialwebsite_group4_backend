package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.EducationService;
import com.infosys.MatrimonialWebApplication.entitites.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/education")
@CrossOrigin("*")
public class EducationController {

    @Autowired
    private EducationService educationService;

    @PostMapping("/")
    public Optional<Education> createEducation(@RequestBody Education education) throws Exception {
        return this.educationService.createEducation(education);

    }

    @GetMapping("/get/{rId}")
    public Optional<Education> getEducation(@PathVariable("rId") Long id){
        return this.educationService.getEducation(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEducation(@PathVariable("id") Long id){
        this.educationService.deleteEducation(id);

    }


}
