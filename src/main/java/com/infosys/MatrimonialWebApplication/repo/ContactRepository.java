package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Contact;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ContactRepository extends JpaRepository<Contact,Long> {
    public  Contact findByEmail(String email);


    public Optional<Contact> findById(Long Id);

}
