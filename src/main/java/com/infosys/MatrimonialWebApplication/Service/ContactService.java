package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ContactService {
    public  Contact createContact(Contact contact) throws Exception;

    public Contact getContact(String email);

    public Optional<Contact> getContactbyId(Long id);

    public void deleteContact(Long id);
    public List<Contact> getAllContact() ;




}

