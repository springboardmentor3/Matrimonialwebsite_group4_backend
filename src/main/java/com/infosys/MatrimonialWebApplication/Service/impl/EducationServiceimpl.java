package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.EducationService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EducationServiceimpl implements EducationService {

    @Autowired
    private EducationRepository educationRepository;

    @Override
    public Optional<Education> createEducation(Education education) throws Exception {
//        Optional<Education> local =  this.educationRepository.findById(education.getId());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");

        Optional<Education> local = Optional.of(this.educationRepository.save(education));

        return local;
    }


    @Override
    public Optional<Education> getEducation(Long id) {
        return this.educationRepository.findByrId(id);
    }

    @Override
    public void deleteEducation(Long id) {
        this.educationRepository.deleteById(id);
    }
}

