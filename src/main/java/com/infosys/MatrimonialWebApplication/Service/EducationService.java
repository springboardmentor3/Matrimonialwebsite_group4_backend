package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EducationService {
    public Optional<Education> createEducation(Education education) throws Exception;

    public Optional<Education> getEducation(Long id);

    public void deleteEducation(Long id);

}

