package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public interface PersonalService {
    public Optional<Personal> createPersonal(Personal personal) throws Exception;

    public Optional<Personal> getPersonal(Long rId);

    public void deletePersonal(Long id);
    public List<Personal> getAllPersonals() ;

}

