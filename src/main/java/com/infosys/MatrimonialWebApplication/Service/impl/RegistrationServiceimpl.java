package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.RegistrationService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistrationServiceimpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public Optional<Registration> createRegistration(Registration registration) throws Exception {
        Optional<Registration> local =  this.registrationRepository.findByEmail(registration.getEmail());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");
//        }else{
            local = Optional.of(this.registrationRepository.save(registration));

        return local;
    }

    @Override
    public Optional<Registration> getRegistration(String email) {
        return this.registrationRepository.findByEmail(email);
    }

    @Override
    public void deleteRegistration(String email) {
        this.registrationRepository.deleteByEmail(email);

    }
}

