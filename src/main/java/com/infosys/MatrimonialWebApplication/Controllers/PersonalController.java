package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.PersonalService;
import com.infosys.MatrimonialWebApplication.entitites.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personal")
@CrossOrigin("*")
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @PostMapping("/")
    public Optional<Personal> createPersonal(@RequestBody Personal personal) throws Exception {
        return this.personalService.createPersonal(personal);

    }

    @GetMapping("/get/{rId}")
    public Optional<Personal> getPersonal(@PathVariable("rId") Long id){
        return this.personalService.getPersonal(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersonal(@PathVariable("id") Long id){
        this.personalService.deletePersonal(id);

    }
    @GetMapping("/personals")
    public List<Personal> getAllPersonals() {
        return this.personalService.getAllPersonals();
    }


}
