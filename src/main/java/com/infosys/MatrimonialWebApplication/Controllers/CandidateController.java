package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.CandidateService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.Candidate;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate")
@CrossOrigin("*")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/")
    public Candidate createCandidate(@RequestBody Candidate candidate) throws Exception {
        return this.candidateService.createCandidate(candidate);

    }

    @GetMapping("/{candid}")
    public Candidate getCandidate(@PathVariable("candid") Long candid){
        return this.candidateService.getCandidate(candid);
    }

//    @GetMapping("/get/{id}")
//    public Optional<User> getUserbyId(@PathVariable("id") Long id){
//        return this.userService.getUserbyId(id);
//    }


    @DeleteMapping("/delete/{candid}")
    public void deleteCandidate(@PathVariable("candid") Long candid){
        this.candidateService.deleteCandidate(candid);

    }

    @GetMapping("/candidates")
    public List<Candidate> getAllCandidate() {
        return this.candidateService.getAllCandidate();
    }

    @PutMapping("/update")
    public ResponseEntity<Candidate> updateCandidate(@RequestBody Candidate candidate) {
        try {
            Candidate updatedCandidate = candidateService.updateCandidate(candidate);
            return ResponseEntity.ok(updatedCandidate);
        } catch (Exception e) {
            return ResponseEntity.status(404).body(null);
        }
    }
}
