package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.RegistrationService;
import com.infosys.MatrimonialWebApplication.entitites.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/")
    public Optional<Registration> createRegistration(@RequestBody Registration registration) throws Exception {
        return this.registrationService.createRegistration(registration);

    }

    @GetMapping("/{email}")
    public Optional<Registration> getRegistration(@PathVariable("email") String email){
        return this.registrationService.getRegistration(email);
    }

    @DeleteMapping("/{email}")
    public void deleteRegistration(@PathVariable("email") String email){
        this.registrationService.deleteRegistration(email);

    }


}
