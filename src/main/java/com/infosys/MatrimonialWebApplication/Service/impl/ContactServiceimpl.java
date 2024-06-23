package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.ContactService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceimpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact createContact(Contact contact ) throws Exception {

        Contact  local = this.contactRepository.save(contact);

        return local;
    }

    @Override
    public Contact getContact(String email) {
        return this.contactRepository.findByEmail(email);
    }

    @Override
    public Optional<Contact> getContactbyId(Long id) {
        return this.contactRepository.findById(id);
    }

    @Override
    public void deleteContact(Long id) {
        this.contactRepository.deleteById(id);

    }

    @Override


    public List<Contact> getAllContact() {

        return this.contactRepository.findAll();
    }


}

