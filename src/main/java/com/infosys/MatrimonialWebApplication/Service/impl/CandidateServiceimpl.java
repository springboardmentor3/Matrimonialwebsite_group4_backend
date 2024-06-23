package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.CandidateService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceimpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate createCandidate(Candidate candidate) throws Exception {
        Candidate local =  this.candidateRepository.findByCandid(candidate.getCandid());
        if(local!=null){
            System.out.println("User already present");
            throw new Exception("User already exists");
        }else{
            local =  this.candidateRepository.save(candidate);
        }
        return local;
    }

    @Override
    public Candidate getCandidate(Long candid) {
        return this.candidateRepository.findByCandid( candid);
    }

//    @Override
//    public Optional<User> getUserbyId(Long id) {
//        return this.userRepository.findById(id);
//    }

    @Override
    public void deleteCandidate(Long id) {
        this.candidateRepository.deleteById(id);

    }

    @Override


    public List<Candidate> getAllCandidate() {

        return this.candidateRepository.findAll();
    }

    @Override
    public Candidate updateCandidate(Candidate candidate) throws Exception {
        Candidate existingCandidate = this.candidateRepository.findByCandid(candidate.getCandid());
        if(existingCandidate == null) {
            throw new Exception("Candidate not found");
        }
        existingCandidate.setName(candidate.getName());
        existingCandidate.setPhone(candidate.getPhone());
        existingCandidate.setEmail(candidate.getEmail());
        existingCandidate.setAddress(candidate.getEmail());
        // set other fields as necessary
        return this.candidateRepository.save(existingCandidate);
    }
}

