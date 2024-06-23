package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.FamilyService;
import com.infosys.MatrimonialWebApplication.Service.PersonalService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FamilyServiceimpl implements FamilyService {

    @Autowired
    private FamilyRepository familyRepository;

    @Override
    public Optional<Family> createFamily(Family family) throws Exception {
//        Optional<Family> local =  this.familyRepository.findById(family.getId());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");

        Optional<Family> local = Optional.of(this.familyRepository.save(family));

        return local;
    }

    @Override
    public Optional<Family> getFamily(Long id) {
        return this.familyRepository.findByRId(id);
    }

    @Override
    public void deleteFamily(Long id) {
        this.familyRepository.deleteById(id);
    }
}

