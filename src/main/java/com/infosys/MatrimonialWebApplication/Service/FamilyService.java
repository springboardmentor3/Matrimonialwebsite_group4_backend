package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FamilyService {
    public Optional<Family> createFamily(Family family) throws Exception;

    public Optional<Family> getFamily(Long id);

    public void deleteFamily(Long id);

}

