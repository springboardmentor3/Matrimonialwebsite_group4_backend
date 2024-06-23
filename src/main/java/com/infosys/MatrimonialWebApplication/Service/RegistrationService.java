package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RegistrationService {
    public Optional<Registration> createRegistration(Registration registration) throws Exception;

    public Optional<Registration> getRegistration(String email);

    public void deleteRegistration(String email);

}

