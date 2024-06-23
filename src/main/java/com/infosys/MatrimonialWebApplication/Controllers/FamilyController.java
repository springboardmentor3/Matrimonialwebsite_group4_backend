package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.FamilyService;
import com.infosys.MatrimonialWebApplication.entitites.Family;
import com.infosys.MatrimonialWebApplication.entitites.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/family")
@CrossOrigin("*")
public class FamilyController {

    @Autowired
    private FamilyService familyService;


    @PostMapping("/")
    public Optional<Family> createFamily(@RequestBody Family family) throws Exception {
        return this.familyService.createFamily(family);

    }

    @GetMapping("/get/{rId}")
    public Optional<Family> getFamily(@PathVariable("rId") Long id){
        return this.familyService.getFamily(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFamily(@PathVariable("id") Long id){
        this.familyService.deleteFamily(id);

    }


}
