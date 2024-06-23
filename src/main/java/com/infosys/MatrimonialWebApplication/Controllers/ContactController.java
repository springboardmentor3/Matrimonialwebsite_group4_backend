package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.ContactService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.Contact;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
@CrossOrigin("*")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/")
    public Contact createContact(@RequestBody Contact contact) throws Exception {
        return this.contactService.createContact(contact);

    }

    @GetMapping("/{email}")
    public Contact getContact(@PathVariable("email") String email){
        return this.contactService.getContact(email);
    }

    @GetMapping("/get/{id}")
    public Optional<Contact> getContactbyId(@PathVariable("id") Long id){
        return this.contactService.getContactbyId(id);
    }


    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable("id") Long id){
        this.contactService.deleteContact(id);

    }

    @GetMapping("/contacts")
    public List<Contact> getAllContact() {
        return this.contactService.getAllContact();
    }




}
