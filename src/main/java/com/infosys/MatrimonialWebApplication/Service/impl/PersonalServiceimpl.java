package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.PersonalService;
import com.infosys.MatrimonialWebApplication.entitites.Personal;
import com.infosys.MatrimonialWebApplication.repo.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalServiceimpl implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public Optional<Personal> createPersonal(Personal personal) throws Exception {
//        Optional<Personal> local =  this.personalRepository.findById(personal.getId());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");

        Optional<Personal> local  = Optional.of(this.personalRepository.save(personal));

        return local;
    }

    @Override
    public Optional<Personal> getPersonal(Long rId) {
        return this.personalRepository.findByrId(rId);
    }

    @Override
    public void deletePersonal(Long id) {
        this.personalRepository.deleteById(id);
    }

    public List<Personal> getAllPersonals() {

        return personalRepository.findAll();
    }
}

